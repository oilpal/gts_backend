package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmAuthGroup;

/**
 * SmAuthGroupRepository
 * @author cm
 *
 */
public interface SmAuthGroupRepository {

	/**
	 * C_SM0907_01
	 * comp, group 필요
	 * @param param
	 * @return
	 */ 
	List<SmAuthGroup> CSM090701(Map<String, Object> param);

	/**
	 * SM_AUTH_MENU_GROUP_R02
	 * @param param
	 * @return
	 */ 
	List<SmAuthGroup> SMAUTHMENUGROUPR02(Map<String, Object> param);

	/**
	 * SM_AUTH_MENU_GROUP_W01
	 * @param param
	 * @return
	 */ 
	List<SmAuthGroup> SMAUTHMENUGROUPW01(Map<String, Object> param);

}
