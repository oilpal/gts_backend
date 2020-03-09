package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.CMORGSTANDARDT;

/**
 * CMORGSTANDARDTRepository
 * @author cm
 *
 */
public interface CMORGSTANDARDTRepository {


	/**
	 * SM0115 | [청소]표준업무관리]
	 * CM_ORG_STANDARD_T_C01
	 * @param param
	 * @return
	 */
	List<CMORGSTANDARDT> CMORGSTANDARDTC01(Map<String, Object> param);
	
}
