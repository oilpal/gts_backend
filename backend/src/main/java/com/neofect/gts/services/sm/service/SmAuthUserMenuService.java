package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmAuthUser;
import com.neofect.gts.services.sm.domain.SmAuthUserMenu;
import com.neofect.gts.services.sm.repository.SmAuthUserMenuRepository;
import com.neofect.gts.services.sm.repository.SmAuthUserRepository;

/**
 * SmAuthUserMenuService
 * @author cm
 *
 */
@Service
public class SmAuthUserMenuService {

	@Autowired
	SmAuthUserMenuRepository smAuthUserMenuRepository;

	/**
	 * SM_AUTH_USER_MENU_C01
	 * @param param
	 * @return
	 */
	public List<SmAuthUserMenu> SMAUTHUSERMENUC01(Map<String, Object> param) {
		return smAuthUserMenuRepository.SMAUTHUSERMENUC01(param);
	}
	
	
}
