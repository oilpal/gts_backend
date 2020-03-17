package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmCommon;
import com.neofect.gts.services.sm.repository.SmCommonRepository;

/**
 * SmCommonService
 * @author cm
 *
 */
@Service
public class SmCommonService {

	@Autowired
	SmCommonRepository commonRepository;


	/**
	 * SmCommon
	 * @param param
	 * @return
	 */
	public List<SmCommon> SMCOMCODED(Map<String, Object> param) {
		return commonRepository.SMCOMCODED(param);
	}
	
	
}
