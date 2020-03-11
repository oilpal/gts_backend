package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmAuthUser;
import com.neofect.gts.services.sm.repository.SmAuthUserRepository;

/**
 * SmAuthUserService
 * @author cm
 *
 */
@Service
public class SmAuthUserService {

	@Autowired
	SmAuthUserRepository smAuthUserRepository;

	/**
	 * C_SM0905_01
	 * @param param
	 * @return
	 */
	public List<SmAuthUser> CSM090501(Map<String, Object> param) {
		return smAuthUserRepository.CSM090501(param);
	}
	
	
}
