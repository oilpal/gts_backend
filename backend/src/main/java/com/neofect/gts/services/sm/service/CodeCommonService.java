package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.repository.CodeRepository;
import com.neofect.gts.services.sm.domain.CMAREACDT;
import com.neofect.gts.services.sm.domain.CMMAGAMJECDT;
import com.neofect.gts.services.sm.domain.CMORGSTANDARDT;
import com.neofect.gts.services.sm.domain.CodeCom;
import com.neofect.gts.services.sm.domain.CodeCommon;
import com.neofect.gts.services.sm.repository.CMAREACDTRepository;
import com.neofect.gts.services.sm.repository.CMMAGAMJECDTRepository;
import com.neofect.gts.services.sm.repository.CMORGSTANDARDTRepository;
import com.neofect.gts.services.sm.repository.CodeComRepository;
import com.neofect.gts.services.sm.repository.CodeCommonRepository;

/**
 * CodeCommonService
 * @author cm
 *
 */
@Service
public class CodeCommonService {

	@Autowired
	CodeCommonRepository codeCommonRepository;


	/**
	 * CodeCommon
	 * @param param
	 * @return
	 */
	public List<CodeCommon> CODECOMLIST(Map<String, Object> param) {
		return codeCommonRepository.CODECOMLIST(param);
	}
	
	
}
