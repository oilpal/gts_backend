package com.neofect.gts.config.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.neofect.gts.util.auth.EgovFileScrty;

import lombok.extern.slf4j.Slf4j;

/**
 * Password Encoder
 * @author jd
 *
 */
@Slf4j
@Component
public class ShaPasswordEncoder implements PasswordEncoder{

	@Override
	public String encode(CharSequence rawPassword) {
		//구 패스워드 인코더 사용
		log.debug("============ShaPasswordEncoder.encode::",rawPassword);
		return EgovFileScrty.encryptPassword(rawPassword.toString());
		//return Crypto.sha256(rawPassword.toString());
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		//return Crypto.sha256(rawPassword.toString()).equals(encodedPassword);
		//구 패스워드 인코더 사용
		log.debug("============ShaPasswordEncoder.matches rawPassword====::",rawPassword);
		log.debug("============ShaPasswordEncoder.matches encodedPassword::",encodedPassword);
		
		return EgovFileScrty.encryptPassword(rawPassword.toString()).equals(encodedPassword);
	}
	
	
}