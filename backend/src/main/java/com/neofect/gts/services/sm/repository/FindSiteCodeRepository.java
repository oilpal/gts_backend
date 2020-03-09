package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.FindSiteCode;

/**
 * FindSiteCodeRepository
 * @author cm
 *
 */
public interface FindSiteCodeRepository {

	/**
	 * FindSiteCode
	 * comp, find 필요
	 * @param param
	 * @return
	 */  
	List<FindSiteCode> FindSiteCode(Map<String, Object> param);
	
}
