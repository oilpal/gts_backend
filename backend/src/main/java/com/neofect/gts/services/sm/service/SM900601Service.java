package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM900601;
import com.neofect.gts.services.sm.repository.SM900601Repository;

/**
 * SM900601Service
 * @author cm
 *
 */
@Service
public class SM900601Service {

	@Autowired
	SM900601Repository sm900601Repository;
	
	/**
	 * DEV_PGM_CODE
	 * @param param
	 * @return
	 */
	
	public List<SM900601> SM900601_GRID(Map<String, Object> param) {
		return sm900601Repository.SM900601_GRID(param);
	}
	
}
