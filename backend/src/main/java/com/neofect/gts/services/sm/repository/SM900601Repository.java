package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM900601;

/**
 * SM900601Repository
 * @author cm
 *
 */
public interface SM900601Repository {
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900601> SM900601_GRID(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	int SM900601_GRID_DELETE(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900601> SM900601_GRIDSRC(Map<String, Object> param);
}
