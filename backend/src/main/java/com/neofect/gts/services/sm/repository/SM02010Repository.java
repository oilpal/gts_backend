package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM02010;

/**
 * SM02010Repository
 * @author cm
 *
 */
public interface SM02010Repository {
	  
	/**
	* 
	* @param param
	* @return
	*/ 
	List<SM02010> SM02010_C01(Map<String, Object> param);

}
