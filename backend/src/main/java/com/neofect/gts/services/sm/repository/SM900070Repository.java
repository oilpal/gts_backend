package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM900070;

/**
 * SM900070Repository
 * @author cm
 *
 */
public interface SM900070Repository {
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900070> GET_RETR_LIST(Map<String, Object> param);

}
