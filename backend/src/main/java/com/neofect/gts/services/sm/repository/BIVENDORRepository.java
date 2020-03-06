package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.BIVENDOR;

/**
 * BIVENDORRepository
 * @author cm
 *
 */
public interface BIVENDORRepository {

	/**
	 * SM 발추처 SELECTBOX_01
	 * W_SM0214_01
	 * companyCode 필요
	 * @param param
	 * @return
	 */  
	List<BIVENDOR> WSM021401(Map<String, Object> param);
	
	/**
	 * SM 발추처 POPUP
	 * W_SM0214_02
	 * search, companyCode, mvendorYn 필요
	 * @param param
	 * @return
	 */  
	List<BIVENDOR> WSM021402(Map<String, Object> param);

}
