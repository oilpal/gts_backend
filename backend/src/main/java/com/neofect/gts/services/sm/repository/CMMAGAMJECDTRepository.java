package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.CMMAGAMJECDT;

/**
 * CMMAGAMJECDTRepository
 * @author cm
 *
 */
public interface CMMAGAMJECDTRepository {

	/**
	 * SM0113 | [청소]마감재관리]
	 * CM_MAGAMJE_CD_T_C01
	 * @param param
	 * @return
	 */
	List<CMMAGAMJECDT> CMMAGAMJECDTC01(Map<String, Object> param);

}
