package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM0103;
import com.neofect.gts.services.sm.repository.SM0103Repository;

/**
 * SM0103Service
 * @author cm
 *
 */
@Service
public class SM0103Service {

	@Autowired
	SM0103Repository sm0103Repository;
	
	/**
	 * 거래처 등록
	 * @param param
	 * @return
	 */
	
	public List<SM0103> BMCOMMMASTERC01(Map<String, Object> param) {
		return sm0103Repository.BMCOMMMASTERC01(param);
	}
	
}
