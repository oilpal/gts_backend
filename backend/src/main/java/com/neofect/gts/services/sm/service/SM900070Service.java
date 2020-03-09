package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM900070;
import com.neofect.gts.services.sm.repository.SM900070Repository;

/**
 * SM900070Service
 * @author cm
 *
 */
@Service
public class SM900070Service {

	@Autowired
	SM900070Repository sm900070Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM900070> GET_RETR_LIST(Map<String, Object> param) {
		return sm900070Repository.GET_RETR_LIST(param);
	}
	
}
