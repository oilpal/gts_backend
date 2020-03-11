package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmCodeIfinfo;
import com.neofect.gts.services.sm.repository.SmCodeIfinfoRepository;

/**
 * SmCodeIfinfoService
 * @author cm
 *
 */
@Service
public class SmCodeIfinfoService {

	@Autowired
	SmCodeIfinfoRepository smCodeIfinfoRepository;
	
	/**
	 * R_SM_CODE_IFINFO_01 
	 * @param param
	 * @return
	 */
	
	public List<SmCodeIfinfo> RSMCODEIFINFO01(Map<String, Object> param) {
		return smCodeIfinfoRepository.RSMCODEIFINFO01(param);
	}
	
}
