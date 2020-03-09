package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SAPWBSREQ;
import com.neofect.gts.services.sm.domain.SbManual;
import com.neofect.gts.services.sm.repository.SAPWBSREQRepository;
import com.neofect.gts.services.sm.repository.SbManualRepository;

/**
 * SbManualService
 * @author cm
 *
 */
@Service
public class SbManualService {

	@Autowired
	SbManualRepository sbManualRepository;

	/**
	 * GET_MANUAL_STATUS
	 * @param param
	 * @return
	 */
	public List<SbManual> GETMANUALSTATUS(Map<String, Object> param) {
		return sbManualRepository.GETMANUALSTATUS(param);
	}
	
	
}
