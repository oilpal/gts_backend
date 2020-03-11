package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM0940;
import com.neofect.gts.services.sm.repository.SM0940Repository;

/**
 * SM0940Service
 * @author cm
 *
 */
@Service
public class SM0940Service {

	@Autowired
	SM0940Repository sm0940Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM0940> SM0940_01_TREE(Map<String, Object> param) {
		return sm0940Repository.SM0940_01_TREE(param);
	}
	
}
