package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM0915;
import com.neofect.gts.services.sm.repository.SM0915Repository;

/**
 * SM0915Service
 * @author cm
 *
 */
@Service
public class SM0915Service {

	@Autowired
	SM0915Repository sm0915Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM0915> SM0915_01(Map<String, Object> param) {
		return sm0915Repository.SM0915_01(param);
	}
	
}
