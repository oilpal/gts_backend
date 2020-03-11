package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM02020;
import com.neofect.gts.services.sm.repository.SM02020Repository;

/**
 * SM02020Service
 * @author cm
 *
 */
@Service
public class SM02020Service {

	@Autowired
	SM02020Repository sm02020Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM02020> SM02020_C01(Map<String, Object> param) {
		return sm02020Repository.SM02020_C01(param);
	}
	
}
