package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM900700;
import com.neofect.gts.services.sm.repository.SM900700Repository;

/**
 * SM900700Service
 * @author cm
 *
 */
@Service
public class SM900700Service {

	@Autowired
	SM900700Repository sm900700Repository;
	
	/**
	 * DEV_PGM_CODE
	 * @param param
	 * @return
	 */
	
	public List<SM900700> SYS_LIST(Map<String, Object> param) {
		return sm900700Repository.SM900700(param);
	}
	
}
