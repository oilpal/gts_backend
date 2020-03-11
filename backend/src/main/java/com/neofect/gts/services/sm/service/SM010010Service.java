package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM010010;
import com.neofect.gts.services.sm.domain.SM01160;
import com.neofect.gts.services.sm.repository.SM010010Repository;
import com.neofect.gts.services.sm.repository.SM01160Repository;

/**
 * SM010010Service
 * @author cm
 *
 */
@Service
public class SM010010Service {

	@Autowired
	SM010010Repository sm010010Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	
	public List<SM010010> CENTERINFO(Map<String, Object> param) {
		return sm010010Repository.CENTERINFO(param);
	}
	
}
