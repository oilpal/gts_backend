package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM0000;

/**
 * SM0000Repository
 * @author cm
 *
 */
public interface SM0000Repository {

	/**
	 * Q01
	 * @param param
	 * @return
	 */  
	List<SM0000> q01(Map<String, Object> param);

}
