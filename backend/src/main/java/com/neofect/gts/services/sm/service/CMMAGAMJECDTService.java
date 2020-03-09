package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.CMAREACDT;
import com.neofect.gts.services.sm.domain.CMMAGAMJECDT;
import com.neofect.gts.services.sm.repository.CMAREACDTRepository;
import com.neofect.gts.services.sm.repository.CMMAGAMJECDTRepository;

/**
 * CMMAGAMJECDTService
 * @author cm
 *
 */
@Service
public class CMMAGAMJECDTService {

	@Autowired
	CMMAGAMJECDTRepository cmmagamjecdtRepository;

	
	/**
	 * SM0113 | [청소]마감재관리]
	 * CM_MAGAMJE_CD_T_C01
	 * @param param
	 * @return
	 */

	public List<CMMAGAMJECDT> CMMAGAMJECDTC01(Map<String, Object> param) {
		return cmmagamjecdtRepository.CMMAGAMJECDTC01(param);
	}
	
	
	
}
