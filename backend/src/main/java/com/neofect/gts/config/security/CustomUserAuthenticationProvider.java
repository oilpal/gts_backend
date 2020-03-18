package com.neofect.gts.config.security;

import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.neofect.gts.services.common.domain.LoginUser;
import com.neofect.gts.services.common.service.UserService;
import com.neofect.gts.util.auth.AuthoritiesUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * CustomUserDetailsService와 기본 DaoAuthenticationProvider를 이용한 폼기반 인증도 있지만,
 * AuthenticationProvider를 활용하고 UserDetailsService를 구현하지 않고 사용하는 폼기반 인증도 있음
 * @author jd
 *
 */
@Slf4j
@Component
public class CustomUserAuthenticationProvider implements AuthenticationProvider {

	private UserDetailsService userDetailsService;
	private ShaPasswordEncoder encoder;
	
	@Autowired
	private UserService userService;
	
	public CustomUserAuthenticationProvider(UserDetailsService userDetailsService,ShaPasswordEncoder encoder) {
		this.userDetailsService = userDetailsService;
		this.encoder = encoder;
	}
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		log.debug("=======================CustomUserAuthenticationProvider.authenticate Start=======================");
		UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken)authentication;
		
		String userId = token.getName();
		
		LoginUser user = new LoginUser();
		UserDetailsImpl findUser = null;
		
		if(!StringUtils.isEmpty(userId)) {
			findUser = (UserDetailsImpl) userDetailsService.loadUserByUsername(userId);
		}
		
		if(ObjectUtils.isEmpty(findUser)) {
			throw new UsernameNotFoundException("Invalid username");
		}
		
		user.setUsername(findUser.getUsername());
		user.setPassword(findUser.getPassword());
		
		String password = user.getPassword();
		String inPassword = userService.getPasswordEncode(token.getCredentials().toString());
		
		//String inPassword = encoder.encode(String.valueOf(token.getCredentials()));
		log.info("=====입력된 패스워드 = "+password + " 토큰 패스워드 = "+token.getCredentials().toString());
		log.info("=====encoding password = "+inPassword );
		if(!StringUtils.equals(password,inPassword)) {
			throw new BadCredentialsException("Invalid password");
		}
		
		Collection<? extends GrantedAuthority> authorities = AuthoritiesUtils.createAuthorities(user);
		
		log.debug("=======================CustomUserAuthenticationProvider.authenticate End=======================");
		
		return new UsernamePasswordAuthenticationToken(user, password, authorities);
		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		log.debug("=============CustomUserAuthenticationProvider.supports=============");
		return UsernamePasswordAuthenticationToken.class.equals(authentication);
	}

}