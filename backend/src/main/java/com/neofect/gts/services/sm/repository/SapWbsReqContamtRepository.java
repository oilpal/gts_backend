package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SapWbsReqContamt;

/**
 * SapWbsReqContamtRepository
 * @author cm
 *
 */
public interface SapWbsReqContamtRepository {

	/**
	 * SM020901
	 * bussno 필요
	 * @param param
	 * @return
	 */    
	List<SapWbsReqContamt> SM020901(Map<String, Object> param);
	
	/**
	 * SM020901_02
	 * bussno 필요
	 * @param param
	 * @return
	 */    
	List<SapWbsReqContamt> SM02090102(Map<String, Object> param);

}
