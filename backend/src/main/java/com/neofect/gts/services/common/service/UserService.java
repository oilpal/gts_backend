package com.neofect.gts.services.common.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.domain.LoginUser;
import com.neofect.gts.services.common.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	/**
	 * 사용자 ID 로 검색
	 * @param param
	 * @return
	 */
	public LoginUser findByUserId(Map<String,Object> param){
		return userRepository.findByUsername(param);
	}

	/**
	 * 비밀번호 Encoding
	 * @param encPassword
	 * @return
	 */
	public String getPasswordEncode(String encPassword) {
		return userRepository.selectPasswordEncode(encPassword);
	}
}
