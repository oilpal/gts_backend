package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmAuthUser;

/**
 * SmAuthUserRepository
 * @author cm
 *
 */
public interface SmAuthUserRepository {


	/**
	 * C_SM0905_01
	 * @param param
	 * @return
	 */
	List<SmAuthUser> CSM090501(Map<String, Object> param);
	
	/**
	 * C_SM0905_01_2
	 * @param param
	 * @return
	 */
	List<SmAuthUser> CSM0905012(Map<String, Object> param);
	
	/**
	 * C_SM0905_01_3
	 * @param param
	 * @return
	 */
	List<SmAuthUser> CSM0905013(Map<String, Object> param);
	
	/**
	 * C_SM0905_02
	 * @param param
	 * @return
	 */
	List<SmAuthUser> CSM090502(Map<String, Object> param);
	
	/**
	 * C_SM0905_03
	 * @param param
	 * @return
	 */
	List<SmAuthUser> CSM090503(Map<String, Object> param);
	
	/**
	 * R_SM0905_01
	 * @param param
	 * @return
	 */
	List<SmAuthUser> RSM090501(Map<String, Object> param);
	
	/**
	 * R_SM0905_02
	 * @param param
	 * @return
	 */
	List<SmAuthUser> RSM090502(Map<String, Object> param);
	
	/**
	 * R_SM0910_01
	 * @param param
	 * @return
	 */
	List<SmAuthUser> RSM091001(Map<String, Object> param);
	
	/**
	 * SM_AUTH_USER_R02
	 * @param param
	 * @return
	 */
	List<SmAuthUser> SMAUTHUSERR02(Map<String, Object> param);
	
	/**
	 * SM_AUTH_USER_U01
	 * @param param
	 * @return
	 */
	List<SmAuthUser> SMAUTHUSERU01(Map<String, Object> param);
	
	/**
	 * R_SM0906_01
	 * @param param
	 * @return
	 */
	List<SmAuthUser> RSM090601(Map<String, Object> param);
	
	/**
	 * R_SM0905_02
	 * @param param
	 * @return
	 */
//	List<SmAuthUser> RSM090502(Map<String, Object> param);
	
	/**
	 * R_SM0905_03
	 * @param param
	 * @return
	 */
	List<SmAuthUser> RSM090503(Map<String, Object> param);
	
	/**
	 * R_SM0906_02
	 * @param param
	 * @return
	 */
	List<SmAuthUser> RSM090602(Map<String, Object> param);
	
	/**
	 * R_SM010200_01
	 * @param param
	 * @return
	 */
	List<SmAuthUser> RSM01020001(Map<String, Object> param);
	
	/**
	 * R_SM010200_02
	 * @param param
	 * @return
	 */
	List<SmAuthUser> RSM01020002(Map<String, Object> param);
	
}
