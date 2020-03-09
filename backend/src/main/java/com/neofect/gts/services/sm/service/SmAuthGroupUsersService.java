package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmAuthGroupMenu;
import com.neofect.gts.services.sm.domain.SmAuthGroupUsers;
import com.neofect.gts.services.sm.repository.SmAuthGroupMenuRepository;
import com.neofect.gts.services.sm.repository.SmAuthGroupUsersRepository;

/**
 * SmAuthGroupUsersService
 * @author cm
 *
 */
@Service
public class SmAuthGroupUsersService {

	@Autowired
	SmAuthGroupUsersRepository smAuthGroupUsersRepository;

	/**
	 * C_SM0909_01
	 * @param param
	 * @return
	 */
	public List<SmAuthGroupUsers> CSM090901(Map<String, Object> param) {
		return smAuthGroupUsersRepository.CSM090901(param);
	}
	
	
}
