package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.XG_COMTC_CMMN_CODE;

/**
 * XG_COMTC_CMMN_CODE Repository
 * @author cm
 *
 */
public interface XG_COMTC_CMMN_CODERepository {

	/**
	 * 
	 * @param param
	 * @return
	 */
	List<XG_COMTC_CMMN_CODE> C_XG_COMTC_CMMN_CODE_01(Map<String, Object> param);

	/**
	 *   
	 * @param param
	 * @return
	 */
	List<XG_COMTC_CMMN_CODE> C_XG_COMTC_CMMN_CODE_02(Map<String, Object> param);

}
