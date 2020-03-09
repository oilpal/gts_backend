package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.XG_APPR;

/**
 * XG_APPR Repository
 * @author cm
 *
 */
public interface XG_APPRRepository {

	/**
	 * 
	 * @param param
	 * @return
	 */
	List<XG_APPR> APPR_STAT(Map<String, Object> param);

	/**
	 *   
	 * @param param
	 * @return
	 */
	List<XG_APPR> APPR_STAT_2(Map<String, Object> param);

}
