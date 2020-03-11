package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmAuthUser2;

/**
 * SmAuthUser2Repository
 * @author cm
 *
 */
public interface SmAuthUser2Repository {

	
	/**
	 * S_SM0916_01
	 * comp, user, tag 필요
	 * @param param
	 * @return
	 */
	List<SmAuthUser2> SSM091601(Map<String, Object> param);
	
	/**
	 * S_SM0916_02
	 * @param param
	 * @return
	 */
	List<SmAuthUser2> SSM091602(Map<String, Object> param);
	
	/**
	 * S_SM0916_03
	 * comp, user 필요
	 * @param param
	 * @return
	 */
	List<SmAuthUser2> SSM091603(Map<String, Object> param);
	
	/**
	 * C_SM0916_01
	 * sysid, user, pgmCd 필요
	 * @param param
	 * @return
	 */
	List<SmAuthUser2> CSM091601(Map<String, Object> param);

}
