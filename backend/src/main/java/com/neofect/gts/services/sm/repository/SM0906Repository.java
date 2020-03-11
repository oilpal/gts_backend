package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM0906;

/**
 * SM0910Repository
 * @author cm
 *
 */
public interface SM0906Repository {
	  
	/**
	* 
	* @param param
	* @return
	*/ 
	List<SM0906> Z_USER_C01(Map<String, Object> param);

	/**
	* 
	* @param param
	* @return
	*/ 
	List<SM0906> BM_COMM_DETAIL_R01(Map<String, Object> param);

	/**
	* 
	* @param param
	* @return
	*/ 
	List<SM0906> SM_AUTH_USER_U01(Map<String, Object> param);

	/**
	* 
	* @param param
	* @return
	*/ 
	List<SM0906> R_SM0906_01(Map<String, Object> param);
	
	/**
	* 
	* @param param
	* @return
	*/ 
	List<SM0906> R_SM050500_02(Map<String, Object> param);
	
	/**
	* 
	* @param param
	* @return
	*/ 
	List<SM0906> R_SM050500_03(Map<String, Object> param);
	
	/**
	* 
	* @param param
	* @return
	*/ 
	List<SM0906> R_SM0906_02(Map<String, Object> param);
}
