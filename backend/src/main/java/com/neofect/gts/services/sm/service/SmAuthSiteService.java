package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmAuthSite;
import com.neofect.gts.services.sm.repository.SmAuthSiteRepository;

/**
 * SmAuthSiteService
 * @author cm
 *
 */
@Service
public class SmAuthSiteService {

	@Autowired
	SmAuthSiteRepository smAuthSiteRepository;

	/**
	 * C_SM0906_01
	 * @param param
	 * @return
	 */
	public List<SmAuthSite> CSM090601(Map<String, Object> param) {
		return smAuthSiteRepository.CSM090601(param);
	}
	
	
}
