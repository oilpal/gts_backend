package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM900600;
import com.neofect.gts.services.sm.repository.SM900600Repository;

/**
 * SM900600Service
 * @author cm
 *
 */
@Service
public class SM900600Service {

	@Autowired
	SM900600Repository sm900600Repository;
	
	/**
	 * DEV_PGM_CODE
	 * @param param
	 * @return
	 */
	
	public int I_GRID(Map<String, Object> param) {
		return sm900600Repository.I_GRID(param);
	}
	
}
