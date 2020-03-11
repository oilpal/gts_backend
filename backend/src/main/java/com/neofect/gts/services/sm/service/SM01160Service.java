package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM01160;
import com.neofect.gts.services.sm.repository.SM01160Repository;

/**
 * SM01160Service
 * @author cm
 *
 */
@Service
public class SM01160Service {

	@Autowired
	SM01160Repository sm01160Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM01160> SM01160_01(Map<String, Object> param) {
		return sm01160Repository.SM01160_01(param);
	}
	
}
