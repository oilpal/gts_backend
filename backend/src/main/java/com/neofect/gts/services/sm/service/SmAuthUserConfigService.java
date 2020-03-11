package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmAuthUserConfig;
import com.neofect.gts.services.sm.repository.SmAuthUserConfigRepository;

/**
 * SmAuthUserConfigService
 * @author cm
 *
 */
@Service
public class SmAuthUserConfigService {

	@Autowired
	SmAuthUserConfigRepository smAuthUserConfigRepository;

	/**
	 * GET_CONFIG_LAYOUT
	 * @param param
	 * @return
	 */
	public List<SmAuthUserConfig> GETCONFIGLAYOUT(Map<String, Object> param) {
		return smAuthUserConfigRepository.GETCONFIGLAYOUT(param);
	}
	
	
}
