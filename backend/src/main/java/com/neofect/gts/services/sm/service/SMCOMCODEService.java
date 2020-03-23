package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SMCOMCODE;
import com.neofect.gts.services.sm.repository.SMCOMCODERepository;

/**
 * SMCOMCODEService
 * @author cm
 *
 */
@Service
public class SMCOMCODEService {

	@Autowired
	SMCOMCODERepository smComCodeRepository;
	
	/**
	 * 공통코드 등록(2019) 리스트 
	 * @param param
	 * @return
	 */
	
	public List<SMCOMCODE> CSM091501(Map<String, Object> param) {
		return smComCodeRepository.CSM091501(param);
	}
	
}
