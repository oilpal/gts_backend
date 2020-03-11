package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM0945;
import com.neofect.gts.services.sm.repository.SM0945Repository;

/**
 * SM0945Service
 * @author cm
 *
 */
@Service
public class SM0945Service {

	@Autowired
	SM0945Repository sm0945Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM0945> SM0945_01(Map<String, Object> param) {
		return sm0945Repository.SM0945_01(param);
	}
	
}
