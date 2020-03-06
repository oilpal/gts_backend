package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.CMAREACDT;
import com.neofect.gts.services.sm.repository.CMAREACDTRepository;

/**
 * CMAREACDTService
 * @author cm
 *
 */
@Service
public class CMAREACDTService {

	@Autowired
	CMAREACDTRepository cmareacdtRepository;
	
	/**
	 * SM0111 | [청소]작업장소관리]
	 * CM_AREA_CD_T_C01
	 * @param param
	 * @return
	 */
	
	public List<CMAREACDT> CMAREACDTC01(Map<String, Object> param) {
		return cmareacdtRepository.CMAREACDTC01(param);
	}
	
}
