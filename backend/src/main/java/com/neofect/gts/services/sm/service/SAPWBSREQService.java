package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SAPWBSREQ;
import com.neofect.gts.services.sm.repository.SAPWBSREQRepository;

/**
 * SAPWBSREQService
 * @author cm
 *
 */
@Service
public class SAPWBSREQService {

	@Autowired
	SAPWBSREQRepository sapwbsreqRepository;

	/**
	 * C_SM0209_01
	 * @param param
	 * @return
	 */
	public List<SAPWBSREQ> CSM020901(Map<String, Object> param) {
		return sapwbsreqRepository.CSM020901(param);
	}
	
	
}
