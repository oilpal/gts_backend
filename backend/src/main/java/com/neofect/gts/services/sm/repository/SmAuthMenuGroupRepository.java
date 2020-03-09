package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmAuthMenuGroup;

/**
 * SmAuthMenuGroupRepository
 * @author cm
 *
 */
public interface SmAuthMenuGroupRepository {

	/**
	 * SM_AUTH_MENU_GROUP_C01
	 * menu 필요
	 * @param param
	 * @return
	 */ 
	List<SmAuthMenuGroup> SMAUTHMENUGROUPC01(Map<String, Object> param);
	
	/**
	 * SM_AUTH_MENU_GROUP_R01
	 * menu 필요
	 * @param param
	 * @return
	 */ 
	List<SmAuthMenuGroup> SMAUTHMENUGROUPR01(Map<String, Object> param);
	
	/**
	 * SM_AUTH_MENU_GROUP_R02
	 * @param param
	 * @return
	 */ 
	List<SmAuthMenuGroup> SMAUTHMENUGROUPR02(Map<String, Object> param);
	
	/**
	 * SM_AUTH_MENU_GROUP_W01
	 * @param param
	 * @return
	 */ 
	List<SmAuthMenuGroup> SMAUTHMENUGROUPW01(Map<String, Object> param);

}
