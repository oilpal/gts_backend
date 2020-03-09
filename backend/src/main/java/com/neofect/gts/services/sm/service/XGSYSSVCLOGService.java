package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.XGSYSSVCLOG;
import com.neofect.gts.services.sm.repository.XGSYSSVCLOGRepository;

/**
 * XGSYSSVCLOG Service
 * @author cm
 *
 */
@Service
public class XGSYSSVCLOGService {

	@Autowired
	XGSYSSVCLOGRepository xgSysSvcLogRepository;
	
	/**
	 *  
	 * @param param
	 * @return
	 */
	
	public List<XGSYSSVCLOG> R_SM0913_01(Map<String, Object> param) {
		return xgSysSvcLogRepository.R_SM0913_01(param);
	}
	
}
