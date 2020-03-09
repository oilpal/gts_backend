package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmAuthGroupMenu;
import com.neofect.gts.services.sm.domain.SmAuthMenuGroup;
import com.neofect.gts.services.sm.repository.SmAuthGroupMenuRepository;
import com.neofect.gts.services.sm.repository.SmAuthMenuGroupRepository;

/**
 * SmAuthMenuGroupService
 * @author cm
 *
 */
@Service
public class SmAuthMenuGroupService {

	@Autowired
	SmAuthMenuGroupRepository smAuthMenuGroupRepository;

	/**
	 * SM_AUTH_MENU_GROUP_C01
	 * @param param
	 * @return
	 */
	public List<SmAuthMenuGroup> SMAUTHMENUGROUPC01(Map<String, Object> param) {
		return smAuthMenuGroupRepository.SMAUTHMENUGROUPC01(param);
	}
	
	
}
