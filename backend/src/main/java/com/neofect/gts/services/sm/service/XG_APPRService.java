package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.XG_APPR;
import com.neofect.gts.services.sm.repository.XG_APPRRepository;

/**
 * XG_APPR Service
 * @author cm
 *
 */
@Service
public class XG_APPRService {

	@Autowired
	XG_APPRRepository xgApprRepository;
	
	/**
	 *  
	 * @param param
	 * @return
	 */
	
	public List<XG_APPR> APPR_STAT(Map<String, Object> param) {
		return xgApprRepository.APPR_STAT(param);
	}
	
}
