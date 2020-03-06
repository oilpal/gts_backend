package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SMCOMCODE;

/**
 * SMCOMCODE Repository
 * @author cm
 *
 */
public interface SMCOMCODERepository {

	/**
	 * C_SM0915_01
	 * * sysId, keyWord 필요 
	 * @param param
	 * @return
	 */
	List<SMCOMCODE> CSM091501(Map<String, Object> param);

	/**
	 * C_SM0915_02
	 * * sysId, hCode 필요 
	 * @param param
	 * @return
	 */
	List<SMCOMCODE> CSM091502(Map<String, Object> param);

	/**
	 * 공통코드삭제, 공통코드 키 체크
	 * D_SM0915_01
	 * * lsHcode, lsSysid 필요 
	 * @param param
	 * @return
	 */
	List<SMCOMCODE> DSM091501(Map<String, Object> param);
	
	/**
	 * SM_AUTH_SYS_LIST
	 * @param param
	 * @return
	 */
	List<SMCOMCODE> SMAUTHSYSLIST(Map<String, Object> param);
	
	/**
	 * SM_COMCODE_C01
	 * sysId, keyword, allShow 필요
	 * @param param
	 * @return
	 */
	List<SMCOMCODE> SMCOMCODEC01(Map<String, Object> param);
	
	/**
	 * SM_COMCODE_C02
	 * hcode, sysId 필요
	 * @param param
	 * @return
	 */
	List<SMCOMCODE> SMCOMCODEC02(Map<String, Object> param);

}
