package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM900800;

/**
 * SM900800Repository
 * @author cm
 *
 */
public interface SM900800Repository {
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900800> SYS_LIST(Map<String, Object> param);

	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900800> CHART_1(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900800> CHART_2(Map<String, Object> param);
}
