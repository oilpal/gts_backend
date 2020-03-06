package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.AuthMenu;
import com.neofect.gts.services.sm.repository.AuthMenuRepository;

/**
 * AuthMenuService
 * @author cm
 *
 */
@Service
public class AuthMenuService {

	@Autowired
	AuthMenuRepository authMenuRepository;
	
	/**
	 * HEAD_MENU
	 * @param param
	 * @return
	 */
	
	public List<AuthMenu> HEADMENU(Map<String, Object> param) {
		return authMenuRepository.HEADMENU(param);
	}
	
}
