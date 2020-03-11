package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM0103;
import com.neofect.gts.services.sm.domain.SM0218;
import com.neofect.gts.services.sm.repository.SM0103Repository;
import com.neofect.gts.services.sm.repository.SM0218Repository;

/**
 * SM0218Service
 * @author cm
 *
 */
@Service
public class SM0218Service {

	@Autowired
	SM0218Repository sm0218Repository;
	
	/**
	 * S_0218_01
	 * @param param
	 * @return
	 */
	
	public List<SM0218> S021801(Map<String, Object> param) {
		return sm0218Repository.S021801(param);
	}
	
}
