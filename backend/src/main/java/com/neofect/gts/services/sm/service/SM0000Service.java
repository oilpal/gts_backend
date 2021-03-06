package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM0000;
import com.neofect.gts.services.sm.repository.SM0000Repository;

/**
 * SM0000Service
 * @author cm
 *
 */
@Service
public class SM0000Service {

	@Autowired
	SM0000Repository sm0000Repository;
	
	/**
	 * 좌측그리드
	 * @param param
	 * @return
	 */
	
	public List<SM0000> q01(Map<String, Object> param) {
		return sm0000Repository.q01(param);
	}
	
}
