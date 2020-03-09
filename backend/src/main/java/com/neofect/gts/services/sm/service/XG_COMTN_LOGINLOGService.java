package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.XG_COMTN_LOGINLOG;
import com.neofect.gts.services.sm.repository.XG_COMTN_LOGINLOGRepository;

/**
 * XG_COMTN_LOGINLOG Service
 * @author cm
 *
 */
@Service
public class XG_COMTN_LOGINLOGService {

	@Autowired
	XG_COMTN_LOGINLOGRepository xgComtnLoginLogRepository;
	
	/**
	 *  
	 * @param param
	 * @return
	 */
	
	public List<XG_COMTN_LOGINLOG> R_SM0912_01(Map<String, Object> param) {
		return xgComtnLoginLogRepository.R_SM0912_01(param);
	}
	
}
