package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM01012;

/**
 * SM01012Repository
 * @author cm
 *
 */
public interface SM01012Repository {

	/**
	 * CODE_COMSEC_C01
	 * @param param
	 * @return
	 */           
	List<SM01012> CODECOMSECC01(Map<String, Object> param);
	
	/**
	 * COMSEC_CODE_C01
	 * @param param
	 * @return
	 */
	List<SM01012> COMSECCODEC01(Map<String, Object> param);

}
