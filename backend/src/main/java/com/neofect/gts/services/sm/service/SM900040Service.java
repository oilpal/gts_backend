package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM900040;
import com.neofect.gts.services.sm.repository.SM900040Repository;

/**
 * SM900040Service
 * @author cm
 *
 */
@Service
public class SM900040Service {

	@Autowired
	SM900040Repository sm900040Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM900040> DEV_PGM_CODE(Map<String, Object> param) {
		return sm900040Repository.DEV_PGM_CODE(param);
	}
	
}
