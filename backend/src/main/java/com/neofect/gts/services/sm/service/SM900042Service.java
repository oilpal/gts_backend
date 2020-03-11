package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM900042;
import com.neofect.gts.services.sm.repository.SM900042Repository;

/**
 * SM900042Service
 * @author cm
 *
 */
@Service
public class SM900042Service {

	@Autowired
	SM900042Repository sm900042Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM900042> DEV_PGM_CODE(Map<String, Object> param) {
		return sm900042Repository.DEV_PGM_CODE(param);
	}
	
}
