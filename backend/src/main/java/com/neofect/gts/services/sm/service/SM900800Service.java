package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM900800;
import com.neofect.gts.services.sm.repository.SM900800Repository;

/**
 * SM900800Service
 * @author cm
 *
 */
@Service
public class SM900800Service {

	@Autowired
	SM900800Repository sm900800Repository;
	
	/**
	 * DEV_PGM_CODE
	 * @param param
	 * @return
	 */
	
	public List<SM900800> SYS_LIST(Map<String, Object> param) {
		return sm900800Repository.SYS_LIST(param);
	}
	
}
