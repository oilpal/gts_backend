package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmFindCode;
import com.neofect.gts.services.sm.repository.SmFindCodeRepository;

/**
 * SmFindCode Service
 * @author cm
 *
 */
@Service
public class SmFindCodeService {

	@Autowired
	SmFindCodeRepository smFindCodeRepository;
	
	/**
	 *  
	 * @param param
	 * @return
	 */
	
	public List<SmFindCode> FindPgmCode(Map<String, Object> param) {
		return smFindCodeRepository.FindPgmCode(param);
	}
	
}
