package com.neofect.gts.config.security;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.neofect.gts.services.common.domain.LoginUser;
import com.neofect.gts.services.common.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * Spring Security 에서 사용
 * @author jd
 *
 */
@Slf4j
@Component
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		
		log.debug("=============================== CustomUserDetailService.loadUserByUsername Start ===============================");
		
		Map<String,Object> param = new HashMap<String,Object>();
		//기존 Global Properties 에서 company Default 코드가 100 이었음 이유는 모름
		param.put("userId", userId);
		param.put("companyCode", "100");
		
		LoginUser user = userService.findByUserId(param);
		
		if(ObjectUtils.isEmpty(user)) {
			throw new UsernameNotFoundException("Invalid userId");
		}
		
		log.debug("=============================== CustomUserDetailService.loadUserByUsername End ===============================");
		
		return LoginUser.build(user);
	}
	
	public String getEncPassword(String password) {
		return userService.getPasswordEncode(password);
	}
}
