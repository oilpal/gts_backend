package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM900600;

/**
 * SM900600Repository
 * @author cm
 *
 */
public interface SM900600Repository {
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	int I_GRID(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900600> R_GRID(Map<String, Object> param);
	
}
