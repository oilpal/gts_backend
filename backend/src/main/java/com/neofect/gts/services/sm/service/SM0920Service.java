package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM0920;
import com.neofect.gts.services.sm.repository.SM0920Repository;

/**
 * SM0920Service
 * @author cm
 *
 */
@Service
public class SM0920Service {

	@Autowired
	SM0920Repository sm0920Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM0920> SM0920_01(Map<String, Object> param) {
		return sm0920Repository.SM0920_01(param);
	}
	
}
