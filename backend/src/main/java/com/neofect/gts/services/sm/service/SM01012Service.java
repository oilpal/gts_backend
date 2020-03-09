package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.ho.domain.HO01020;
import com.neofect.gts.services.ho.repository.HO01020Repository;
import com.neofect.gts.services.sm.domain.SM01012;
import com.neofect.gts.services.sm.domain.SMCOMCODE;
import com.neofect.gts.services.sm.repository.SM01012Repository;
import com.neofect.gts.services.sm.repository.SMCOMCODERepository;

/**
 * SM01012Service
 * @author cm
 *
 */
@Service
public class SM01012Service {

	@Autowired
	SM01012Repository sm01012Repository;
	
	/**
	 * 공통코드 등록
	 * @param param
	 * @return
	 */
	
	public List<SM01012> CODECOMSECC01(Map<String, Object> param) {
		return sm01012Repository.CODECOMSECC01(param);
	}
	
}
