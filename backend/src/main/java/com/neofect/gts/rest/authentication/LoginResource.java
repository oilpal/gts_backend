package com.neofect.gts.rest.authentication;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neofect.gts.config.security.CustomUserAuthenticationProvider;
import com.neofect.gts.config.security.jwt.JwtResponse;
import com.neofect.gts.config.security.jwt.JwtUtils;
import com.neofect.gts.services.common.domain.LoginUser;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class LoginResource {
	
	@Autowired
	CustomUserAuthenticationProvider authenticationManager;

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	JwtUtils jwtUtils;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginUser loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);
		
		LoginUser userDetails = (LoginUser) authentication.getPrincipal();
		
		List<String> roles = userDetails.getAuthorities().stream()
				.map(item -> item.getAuthority())
				.collect(Collectors.toList());
		
		return ResponseEntity.ok(new JwtResponse(jwt, 
												 userDetails.getId(), 
												 userDetails.getUsername(), 
												 userDetails.getEmail(),
												 roles,"200"));
	}
	
	@PostMapping("/refresh")
	public ResponseEntity<?> refreshAuthenticateUser(HttpServletRequest request) {
		
		String headerAuth = request.getHeader("Authorization");

		if (StringUtils.hasText(headerAuth) && headerAuth.startsWith("Bearer ")) {
			String jwt = headerAuth.substring(7, headerAuth.length());
			
			if (jwt != null && jwtUtils.validateJwtToken(jwt)) {
				String username = jwtUtils.getUserNameFromJwtToken(jwt);
				
				UserDetails userDetails = userDetailsService.loadUserByUsername(username);
				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());
				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				
				SecurityContextHolder.getContext().setAuthentication(authentication);
				
				jwt = jwtUtils.generateJwtToken(authentication);
				
				LoginUser userInfo = (LoginUser) authentication.getPrincipal();
				
				List<String> roles = userInfo.getAuthorities().stream()
						.map(item -> item.getAuthority())
						.collect(Collectors.toList());
				return ResponseEntity.ok(new JwtResponse(jwt, 
						userInfo.getId(), 
						userInfo.getUsername(), 
						userInfo.getEmail(),
						roles, "200"));
			}else {
				return ResponseEntity.ok(new JwtResponse(null, 
						0L, 
						"anonymous", 
						"anonymous",
						null, "500"));
			}
		}else {
			return ResponseEntity.ok(new JwtResponse(null, 
					0L, 
					"anonymous", 
					"anonymous",
					null, "500"));
		}
	}
}
