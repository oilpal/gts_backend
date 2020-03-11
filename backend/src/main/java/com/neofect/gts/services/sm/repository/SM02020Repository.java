package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM02020;

/**
 * SM0910Repository
 * @author cm
 *
 */
public interface SM02020Repository {
	  
	/**
	* 
	* @param param
	* @return
	*/ 
	List<SM02020> SM02020_C01(Map<String, Object> param);

}
