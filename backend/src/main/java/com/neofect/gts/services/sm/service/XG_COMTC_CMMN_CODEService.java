package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.XG_COMTC_CMMN_CODE;
import com.neofect.gts.services.sm.repository.XG_COMTC_CMMN_CODERepository;

/**
 * XG_COMTC_CMMN_CODE Service
 * @author cm
 *
 */
@Service
public class XG_COMTC_CMMN_CODEService {

	@Autowired
	XG_COMTC_CMMN_CODERepository xgComtcCmmnCodeRepository;
	
	/**
	 *  
	 * @param param
	 * @return
	 */
	
	public List<XG_COMTC_CMMN_CODE> C_XG_COMTC_CMMN_CODE_01(Map<String, Object> param) {
		return xgComtcCmmnCodeRepository.C_XG_COMTC_CMMN_CODE_01(param);
	}
	
}
