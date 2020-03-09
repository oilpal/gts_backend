package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.XGSYSSVCLOG;

/**
 * SMCOMCODE Repository
 * @author cm
 *
 */
public interface XGSYSSVCLOGRepository {

	/**
	 * 
	 * @param param
	 * @return
	 */
	List<XGSYSSVCLOG> R_SM0913_01(Map<String, Object> param);

	/**
	 *   
	 * @param param
	 * @return
	 */
	List<XGSYSSVCLOG> R_SM0913_02(Map<String, Object> param);
}
