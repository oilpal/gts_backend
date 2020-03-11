package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM0906;
import com.neofect.gts.services.sm.repository.SM0906Repository;

/**
 * SM0906Service
 * @author cm
 *
 */
@Service
public class SM0906Service {

	@Autowired
	SM0906Repository sm0906Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM0906> Z_USER_C01(Map<String, Object> param) {
		return sm0906Repository.Z_USER_C01(param);
	}
	
}
