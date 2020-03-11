package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM0930;
import com.neofect.gts.services.sm.repository.SM0930Repository;

/**
 * SM0930Service
 * @author cm
 *
 */
@Service
public class SM0930Service {

	@Autowired
	SM0930Repository sm0930Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM0930> SM0930_01(Map<String, Object> param) {
		return sm0930Repository.SM0930_01(param);
	}
	
}
