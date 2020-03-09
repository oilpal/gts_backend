package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM900050;
import com.neofect.gts.services.sm.repository.SM900050Repository;

/**
 * SM900050Service
 * @author cm
 *
 */
@Service
public class SM900050Service {

	@Autowired
	SM900050Repository sm900050Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	List<SM900050> PGM_CODE_LIST(Map<String, Object> param) {
		return sm900050Repository.PGM_CODE_LIST(param);
	}
	
}
