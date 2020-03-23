package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SM01012;
import com.neofect.gts.services.sm.domain.SM01020;
import com.neofect.gts.services.sm.domain.SMCOMCODE;
import com.neofect.gts.services.sm.repository.SM01012Repository;
import com.neofect.gts.services.sm.repository.SM01020Repository;
import com.neofect.gts.services.sm.repository.SMCOMCODERepository;

/**
 * SM01020Service
 * @author cm
 *
 */
@Service
public class SM01020Service {

	@Autowired
	SM01020Repository sm01020Repository;
	
	/**
	 * 거래처 등록
	 * @param param
	 * @return
	 */
	
	public List<SM01020> SM0102001(Map<String, Object> param) {
		return sm01020Repository.SM0102001(param);
	}
	
}
