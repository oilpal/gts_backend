package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM010010;
import com.neofect.gts.services.sm.domain.SM010200;
import com.neofect.gts.services.sm.domain.SM01160;
import com.neofect.gts.services.sm.repository.SM010010Repository;
import com.neofect.gts.services.sm.repository.SM010200Repository;
import com.neofect.gts.services.sm.repository.SM01160Repository;

/**
 * SM010200Service
 * @author cm
 *
 */
@Service
public class SM010200Service {

	@Autowired
	SM010200Repository sm010200Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	public List<SM010200> R_SM010200_01(Map<String, Object> param) {
		return sm010200Repository.R_SM010200_01(param);
	}
	
}
