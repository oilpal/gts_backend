package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.XG_COMTN_BBS_USE;
import com.neofect.gts.services.sm.repository.XG_COMTN_BBS_USERepository;

/**
 * XG_COMTN_LOGINLOG Service
 * @author cm
 *
 */
@Service
public class XG_COMTN_BBS_USEService {

	@Autowired
	XG_COMTN_BBS_USERepository xgComtnBbsUseRepository;
	
	/**
	 *  
	 * @param param
	 * @return
	 */
	
	public List<XG_COMTN_BBS_USE> C_SM0815_01(Map<String, Object> param) {
		return xgComtnBbsUseRepository.C_SM0815_01(param);
	}
	
}
