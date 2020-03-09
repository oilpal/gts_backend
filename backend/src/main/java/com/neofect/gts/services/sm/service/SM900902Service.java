package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM900902;
import com.neofect.gts.services.sm.repository.SM900902Repository;

/**
 * SM900902Service
 * @author cm
 *
 */
@Service
public class SM900902Service {

	@Autowired
	SM900902Repository sm900902Repository;
	
	/**
	 * DEV_PGM_CODE
	 * @param param
	 * @return
	 */
	
	public List<SM900902> SM900902(Map<String, Object> param) {
		return sm900902Repository.SM900902(param);
	}
	
}
