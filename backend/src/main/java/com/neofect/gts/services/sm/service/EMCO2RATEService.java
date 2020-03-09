package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.EMCO2RATE;
import com.neofect.gts.services.sm.repository.EMCO2RATERepository;

/**
 * EMCO2RATEService
 * @author cm
 *
 */
@Service
public class EMCO2RATEService {

	@Autowired
	EMCO2RATERepository emco2RateRepository;

	/**
	 * EMCO2RATE
	 * @param param
	 * @return
	 */
	public List<EMCO2RATE> CSM013301(Map<String, Object> param) {
		return emco2RateRepository.CSM013301(param);
	}


	
	
}
