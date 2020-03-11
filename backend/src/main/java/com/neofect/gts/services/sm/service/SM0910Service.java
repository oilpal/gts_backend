package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM0910;
import com.neofect.gts.services.sm.repository.SM0910Repository;

/**
 * SM0910Service
 * @author cm
 *
 */
@Service
public class SM0910Service {

	@Autowired
	SM0910Repository sm0910Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM0910> SM0910_01(Map<String, Object> param) {
		return sm0910Repository.SM0910_01(param);
	}
	
}
