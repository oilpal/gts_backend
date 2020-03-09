package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.FindCustCode;

/**
 * FindCustCodeRepository
 * @author cm
 *
 */
public interface FindCustCodeRepository {

	/**
	 * FindCustCode
	 * find 필요
	 * @param param
	 * @return
	 */   
	List<FindCustCode> FindCustCode(Map<String, Object> param);

}
