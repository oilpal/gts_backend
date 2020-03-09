package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.XG_COMTN_BBS_USE;

/**
 * XG_COMTN_BBS_USE Repository
 * @author cm
 *
 */
public interface XG_COMTN_BBS_USERepository {

	/**
	 * 
	 * @param param
	 * @return
	 */
	List<XG_COMTN_BBS_USE> C_SM0815_01(Map<String, Object> param);

	/**
	 *   
	 * @param param
	 * @return
	 */
	List<XG_COMTN_BBS_USE> C_SM0815_02(Map<String, Object> param);

}
