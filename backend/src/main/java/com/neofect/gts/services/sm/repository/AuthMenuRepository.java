package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.AuthMenu;

/**
 * AuthMenuRepository
 * @author cm
 *
 */
public interface AuthMenuRepository {

	/**
	 * HEAD_MENU
	 * tmpCompanyCode, tmpStdCode 필요
	 * @param param
	 * @return
	 */   
	List<AuthMenu> HEADMENU(Map<String, Object> param);

}
