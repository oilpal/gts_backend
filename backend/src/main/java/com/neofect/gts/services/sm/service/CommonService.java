package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.Common;
import com.neofect.gts.services.sm.repository.CommonRepository;

/**
 * CommonService
 * @author cm
 *
 */
@Service
public class CommonService {

	@Autowired
	CommonRepository commonRepository;


	/**
	 * Common
	 * @param param
	 * @return
	 */
	public List<Common> SMCOMCODED(Map<String, Object> param) {
		return commonRepository.SMCOMCODED(param);
	}
	
	
}
