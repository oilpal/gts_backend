package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM900400;

/**
 * SM900400Repository
 * @author cm
 *
 */
public interface SM900400Repository {
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900400> SM_SMS_RECTEMP(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */  
	List<SM900400> SM_SMS_TEMP_SEND(Map<String, Object> param);
	
}
