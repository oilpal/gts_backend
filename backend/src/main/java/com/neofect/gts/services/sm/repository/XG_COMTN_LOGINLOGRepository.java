package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.XG_COMTN_LOGINLOG;

/**
 * XG_COMTN_LOGINLOG Repository
 * @author cm
 *
 */
public interface XG_COMTN_LOGINLOGRepository {

	/**
	 * 
	 * @param param
	 * @return
	 */
	List<XG_COMTN_LOGINLOG> R_SM0912_01(Map<String, Object> param);

	/**
	 *   
	 * @param param
	 * @return
	 */
	List<XG_COMTN_LOGINLOG> R_SM0912_02(Map<String, Object> param);

}
