package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM900071;

/**
 * SM900071Repository
 * @author cm
 *
 */
public interface SM900071Repository {
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900071> R_SM900071_C1(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900071> R_SM900071_R1(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900071> R_SM900071_R2(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900071> GET_HTML(Map<String, Object> param);
}
