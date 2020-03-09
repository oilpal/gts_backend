package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.CMAREACDT;
import com.neofect.gts.services.sm.domain.CMMAGAMJECDT;
import com.neofect.gts.services.sm.domain.CMORGSTANDARDT;
import com.neofect.gts.services.sm.repository.CMAREACDTRepository;
import com.neofect.gts.services.sm.repository.CMMAGAMJECDTRepository;
import com.neofect.gts.services.sm.repository.CMORGSTANDARDTRepository;

/**
 * CMORGSTANDARDTService
 * @author cm
 *
 */
@Service
public class CMORGSTANDARDTService {

	@Autowired
	CMORGSTANDARDTRepository cmorgstandardtRepository;

	/**
	 * SM0115 | [청소]표준업무관리]
	 * CM_ORG_STANDARD_T_C01
	 * @param param
	 * @return
	 */
	public List<CMORGSTANDARDT> CMORGSTANDARDTC01(Map<String, Object> param) {
		return cmorgstandardtRepository.CMORGSTANDARDTC01(param);
	}
	
	
}
