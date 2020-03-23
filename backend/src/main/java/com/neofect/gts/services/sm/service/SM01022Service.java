package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM01012;
import com.neofect.gts.services.sm.domain.SM01020;
import com.neofect.gts.services.sm.domain.SM01022;
import com.neofect.gts.services.sm.domain.SMCOMCODE;
import com.neofect.gts.services.sm.repository.SM01012Repository;
import com.neofect.gts.services.sm.repository.SM01020Repository;
import com.neofect.gts.services.sm.repository.SM01022Repository;
import com.neofect.gts.services.sm.repository.SMCOMCODERepository;

/**
 * SM01022Service
 * @author cm
 *
 */
@Service
public class SM01022Service {

	@Autowired
	SM01022Repository sm01022Repository;
	
	/**
	 * SM01022_01
	 * @param param
	 * @return
	 */
	
	public List<SM01022> SM0102201(Map<String, Object> param) {
		return sm01022Repository.SM0102201(param);
	}
	
}
