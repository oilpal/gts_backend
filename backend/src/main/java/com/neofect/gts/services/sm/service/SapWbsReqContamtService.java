package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SapWbsReqContamt;
import com.neofect.gts.services.sm.repository.SapWbsReqContamtRepository;

/**
 * SapWbsReqContamtService
 * @author cm
 *
 */
@Service
public class SapWbsReqContamtService {

	@Autowired
	SapWbsReqContamtRepository sapWbsReqContamtRepository;

	/**
	 * SM020901
	 * @param param
	 * @return
	 */
	public List<SapWbsReqContamt> SM020901(Map<String, Object> param) {
		return sapWbsReqContamtRepository.SM020901(param);
	}
	
	
}
