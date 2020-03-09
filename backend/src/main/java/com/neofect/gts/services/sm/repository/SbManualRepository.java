package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SbManual;

/**
 * SbManualRepository
 * @author cm
 *
 */
public interface SbManualRepository {

	/**
	 * GET_MANUAL_STATUS
	 * comp, pgmCode 필요
	 * @param param
	 * @return
	 */     
	List<SbManual> GETMANUALSTATUS(Map<String, Object> param);

}
