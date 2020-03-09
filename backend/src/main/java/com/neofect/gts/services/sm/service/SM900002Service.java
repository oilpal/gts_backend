package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM900002;
import com.neofect.gts.services.sm.repository.SM900002Repository;

/**
 * SM900002Service
 * @author cm
 *
 */
@Service
public class SM900002Service {

	@Autowired
	SM900002Repository sm900002Repository;
	
	/**
	 * DEV_PGM_CODE
	 * @param param
	 * @return
	 */
	
	public List<SM900002> DEVPGMCODE(Map<String, Object> param) {
		return sm900002Repository.DEVPGMCODE(param);
	}
	
}
