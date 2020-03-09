package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmAuthPgmcode;
import com.neofect.gts.services.sm.repository.SmAuthPgmcodeRepository;

/**
 * SmAuthPgmcodeService
 * @author cm
 *
 */
@Service
public class SmAuthPgmcodeService {

	@Autowired
	SmAuthPgmcodeRepository smAuthPgmcodeRepository;

	/**
	 * C_SM0903_01
	 * @param param
	 * @return
	 */
	public List<SmAuthPgmcode> CSM090301(Map<String, Object> param) {
		return smAuthPgmcodeRepository.CSM090301(param);
	}
	
	
}
