package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.CMAREACDT;

/**
 * CMAREACDTRepository
 * @author cm
 *
 */
public interface CMAREACDTRepository {

	/**
	 * SM0111 | [청소]작업장소관리]
	 * CM_AREA_CD_T_C01
	 * @param param
	 * @return
	 */
	List<CMAREACDT> CMAREACDTC01(Map<String, Object> param);

}
