package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.EMCO2;

/**
 * EMCO2Repository
 * @author cm
 *
 */
public interface EMCO2Repository {

	/**
	 * EM_CO2_C01
	 * date 필요
	 * @param param
	 * @return
	 */
	List<EMCO2> EMCO2C01(Map<String, Object> param);

}
