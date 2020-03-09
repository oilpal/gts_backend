package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM900050;

/**
 * SM900050Repository
 * @author cm
 *
 */
public interface SM900050Repository {
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900050> PGM_CODE_LIST(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900050> DEV_GRID_COLS(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900050> DEV_GRID(Map<String, Object> param);
}
