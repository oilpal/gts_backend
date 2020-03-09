package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmAuthGroupUsers;

/**
 * SmAuthGroupUsersRepository
 * @author cm
 *
 */
public interface SmAuthGroupUsersRepository {

	/**
	 * C_SM0909_01
	 * comp, group 필요
	 * @param param
	 * @return
	 */ 
	List<SmAuthGroupUsers> CSM090901(Map<String, Object> param);
	
	/**
	 * R_SM0909_01
	 * comp, group, user 필요
	 * @param param
	 * @return
	 */ 
	List<SmAuthGroupUsers> RSM090901(Map<String, Object> param);
	
	/**
	 * C_SM0910_01
	 * comp, user 필요
	 * @param param
	 * @return
	 */ 
	List<SmAuthGroupUsers> CSM091001(Map<String, Object> param);
	
	/**
	 * S_MAIN_01
	 * @param param
	 * @return
	 */ 
	List<SmAuthGroupUsers> SMAIN01(Map<String, Object> param);

}
