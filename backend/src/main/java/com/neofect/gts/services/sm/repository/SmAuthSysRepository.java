package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmAuthSys;

/**
 * SmAuthSysRepository
 * @author cm
 *
 */
public interface SmAuthSysRepository {

	/**
	 * C_SM0901_01
	 * @param param
	 * @return
	 */
	List<SmAuthSys> CSM090101(Map<String, Object> param);

	/**
	 * W_SM0915_01
	 * @param param
	 * @return
	 */
	List<SmAuthSys> WSM091501(Map<String, Object> param);

	/**
	 * W_SM0915_02
	 * @param param
	 * @return
	 */
	List<SmAuthSys> WSM091502(Map<String, Object> param);

	/**
	 * R_SM0903_01
	 * @param param
	 * @return
	 */
	List<SmAuthSys> RSM090301(Map<String, Object> param);
	
	/**
	 * SM_AUTH_SYS_R02
	 * sysId 필요
	 * @param param
	 * @return
	 */
	List<SmAuthSys> SMAUTHSYSR02(Map<String, Object> param);
	
	/**
	 * SM_AUTH_SYS_R01
	 * @param param
	 * @return
	 */
	List<SmAuthSys> SMAUTHSYSR01(Map<String, Object> param);

}
