package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM01140;
import com.neofect.gts.services.sm.domain.SM01160;
import com.neofect.gts.services.sm.repository.SM01140Repository;
import com.neofect.gts.services.sm.repository.SM01160Repository;

/**
 * SM01140Service
 * @author cm
 *
 */
@Service
public class SM01140Service {

	@Autowired
	SM01140Repository sm01140Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	public List<SM01140> SM01140_01(Map<String, Object> param) {
		return sm01140Repository.SM01140_01(param);
	}
	
}
