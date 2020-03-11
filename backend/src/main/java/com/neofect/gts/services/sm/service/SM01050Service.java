package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM01050;
import com.neofect.gts.services.sm.domain.SM01160;
import com.neofect.gts.services.sm.repository.SM01050Repository;
import com.neofect.gts.services.sm.repository.SM01160Repository;

/**
 * SM01050Service
 * @author cm
 *
 */
@Service
public class SM01050Service {

	@Autowired
	SM01050Repository sm01050Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	public List<SM01050> SM01050R01(Map<String, Object> param) {
		return sm01050Repository.SM01050R01(param);
	}
	
}
