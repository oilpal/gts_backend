package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM900400;
import com.neofect.gts.services.sm.repository.SM900400Repository;

/**
 * SM900400Service
 * @author cm
 *
 */
@Service
public class SM900400Service {

	@Autowired
	SM900400Repository sm900400Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	public List<SM900400> SM_SMS_RECTEMP(Map<String, Object> param) {
		return sm900400Repository.SM_SMS_RECTEMP(param);
	}
	
}
