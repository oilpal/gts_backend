package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmAuthPgmcode;
import com.neofect.gts.services.sm.domain.SmAuthSys;
import com.neofect.gts.services.sm.repository.SmAuthPgmcodeRepository;
import com.neofect.gts.services.sm.repository.SmAuthSysRepository;

/**
 * SmAuthSysService
 * @author cm
 *
 */
@Service
public class SmAuthSysService {

	@Autowired
	SmAuthSysRepository SmAuthSysRepository;

	/**
	 * C_SM0901_01
	 * @param param
	 * @return
	 */
	public List<SmAuthSys> CSM090101(Map<String, Object> param) {
		return SmAuthSysRepository.CSM090101(param);
	}
	
	
}
