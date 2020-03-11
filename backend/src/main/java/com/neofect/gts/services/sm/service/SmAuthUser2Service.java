package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmAuthUser2;
import com.neofect.gts.services.sm.repository.SmAuthUser2Repository;

/**
 * SmAuthUser2Service
 * @author cm
 *
 */
@Service
public class SmAuthUser2Service {

	@Autowired
	SmAuthUser2Repository smAuthUser2Repository;

	/**
	 * S_SM0916_01
	 * @param param
	 * @return
	 */
	public List<SmAuthUser2> SSM091601(Map<String, Object> param) {
		return smAuthUser2Repository.SSM091601(param);
	}
	
	
}
