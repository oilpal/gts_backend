package com.neofect.gts.services.common.repository;

import java.util.Map;

import com.neofect.gts.services.common.domain.LoginUser;

/**
 * 사용자 로그인 정보 관리 
 * @author jd
 *
 */
public interface UserRepository {

	/**
	 * 사용자 ID로 검색
	 * @param param
	 * @return
	 */
	public LoginUser findByUsername(Map<String,Object> param);
	
	/**
	 * 패스워드 Encoding
	 * @param encPassword
	 * @return
	 */
	public String selectPasswordEncode(String encPassword);
}
