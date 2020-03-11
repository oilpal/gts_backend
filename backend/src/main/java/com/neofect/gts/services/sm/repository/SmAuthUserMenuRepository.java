package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmAuthUserMenu;

/**
 * SmAuthUserMenuRepository
 * @author cm
 *
 */
public interface SmAuthUserMenuRepository {

	/**
	 * SM_AUTH_USER_MENU_C01
	 * auth, sys, pgm 필요
	 * @param param
	 * @return
	 */
	List<SmAuthUserMenu> SMAUTHUSERMENUC01(Map<String, Object> param);
	
	/**
	 * SM_AUTH_USER_MENU_C02
	 * auth, sys, pgm 필요
	 * @param param
	 * @return
	 */
	List<SmAuthUserMenu> SMAUTHUSERMENUC02(Map<String, Object> param);

}
