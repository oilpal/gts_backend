package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmAuthPgmcode;

/**
 * SmAuthPgmcodeRepository
 * @author cm
 *
 */
public interface SmAuthPgmcodeRepository {

	/**
	 * C_SM0903_01
	 * * sysId, pgmNm 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthPgmcode> CSM090301(Map<String, Object> param);
	
	/**
	 * R_SM0991_01
	 * sys, pgmNm, comp, group 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthPgmcode> RSM099101(Map<String, Object> param);
	
	/**
	 * R_SM0992_01
	 * sys, pgmNm, comp, group, user 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthPgmcode> RSM099201(Map<String, Object> param);
	
	/**
	 * R_EGOVMAIN_01
	 * sysId, comp, user 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthPgmcode> REGOVMAIN01(Map<String, Object> param);
	
	/**
	 * R_EGOVMAIN_01_OLD
	 * comp, user 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthPgmcode> REGOVMAIN01OLD(Map<String, Object> param);
	
	/**
	 * SM_AUTH_PGMCODE_R01
	 * pgmCode 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthPgmcode> SMAUTHPGMCODER01(Map<String, Object> param);
	
	/**
	 * SM_AUTH_PGMCODE_R02
	 * pgmCode 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthPgmcode> SMAUTHPGMCODER02(Map<String, Object> param);
	
	/**
	 * SM_AUTH_PGMCODE_R021
	 * authCode 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthPgmcode> SMAUTHPGMCODER021(Map<String, Object> param);
	
	/**
	 * R_AUTH_BUTTON_01
	 * authCode, pgmCode 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthPgmcode> RAUTHBUTTON01(Map<String, Object> param);
	
	/**
	 * SM_AUTH_PGMCODE_R03
	 * authCode, pgmCode 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthPgmcode> SMAUTHPGMCODER03(Map<String, Object> param);
	
	/**
	 * SM_AUTH_PGMCODE_R031
	 * authCode, pgmCode 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthPgmcode> SMAUTHPGMCODER031(Map<String, Object> param);
	
	/**
	 * C_SM0904_01
	 * sysId, pgmNm 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthPgmcode> CSM090401(Map<String, Object> param);
	
	/**
	 * MY_AUTH_ACT
	 * companyCode, userId 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthPgmcode> MYAUTHACT(Map<String, Object> param);
	
}
