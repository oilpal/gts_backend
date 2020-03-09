package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmAuthGroupMenu;

/**
 * SmAuthGroupMenuRepository
 * @author cm
 *
 */
public interface SmAuthGroupMenuRepository {


	/**
	 * C_SM0907_01
	 * comp, group, sys, pgm 필요
	 * @param param
	 * @return
	 */ 
	List<SmAuthGroupMenu> CSM090701(Map<String, Object> param);
	
	/**
	 * S_SM0907_01
	 * comp, group, menu 필요
	 * @param param
	 * @return
	 */ 
	List<SmAuthGroupMenu> SSM090701(Map<String, Object> param);
	
	/**
	 * SM_AUTH_MENU_GROUP_R02
	 * comp, group 필요
	 * @param param
	 * @return
	 */ 
	List<SmAuthGroupMenu> SMAUTHMENUGROUPR02(Map<String, Object> param);
	
	/**
	 * SM_AUTH_MENU_GROUP_W01
	 * @param param
	 * @return
	 */ 
	List<SmAuthGroupMenu> SMAUTHMENUGROUPW01(Map<String, Object> param);
	
	/**
	 * S_SM0918_01
	 * companyCode, userId, sysId, menuCode 필요
	 * @param param
	 * @return
	 */ 
	List<SmAuthGroupMenu> SSM091801(Map<String, Object> param);
	
}
