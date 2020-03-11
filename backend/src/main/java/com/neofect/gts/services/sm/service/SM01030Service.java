package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM01030;
import com.neofect.gts.services.sm.repository.SM01030Repository;

/**
 * SM01030Service
 * @author cm
 *
 */
@Service
public class SM01030Service {

	@Autowired
	SM01030Repository sm01030Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	public List<SM01030> SM0103001(Map<String, Object> param) {
		return sm01030Repository.SM0103001(param);
	}
	
}
