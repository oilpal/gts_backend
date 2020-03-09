package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.EMCO2RATE;

/**
 * EMCO2RATERepository
 * @author cm
 *
 */
public interface EMCO2RATERepository {
	
	/**
	 * C_SM0133_01
	 * comp, date 필요
	 * @param param
	 * @return
	 */
	List<EMCO2RATE> CSM013301(Map<String, Object> param);

	/**
	 * C_SM0133_02
	 * comp 필요
	 * @param param
	 * @return
	 */
	List<EMCO2RATE> CSM013302(Map<String, Object> param);
	
	/**
	 * C_SM0133_03
	 * comp, code, date 필요
	 * @param param
	 * @return
	 */
	List<EMCO2RATE> CSM013303(Map<String, Object> param);

}
