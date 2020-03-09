package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM900071;
import com.neofect.gts.services.sm.repository.SM900071Repository;

/**
 * SM900071Service
 * @author cm
 *
 */
@Service
public class SM900071Service {

	@Autowired
	SM900071Repository sm900071Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM900071> R_SM900071_C1(Map<String, Object> param) {
		return sm900071Repository.R_SM900071_C1(param);
	}
	
}
