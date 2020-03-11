package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM02010;
import com.neofect.gts.services.sm.repository.SM02010Repository;

/**
 * SM02010Service
 * @author cm
 *
 */
@Service
public class SM02010Service {

	@Autowired
	SM02010Repository sm02010Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM02010> SM02010_C01(Map<String, Object> param) {
		return sm02010Repository.SM02010_C01(param);
	}
	
}
