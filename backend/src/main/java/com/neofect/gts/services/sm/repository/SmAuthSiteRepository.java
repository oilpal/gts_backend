package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmAuthSite;

/**
 * SmAuthSiteRepository
 * @author cm
 *
 */
public interface SmAuthSiteRepository {

	/**
	 * C_SM0906_01
	 * comp, user 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthSite> CSM090601(Map<String, Object> param);

	/**
	 * S_SM0906_01
	 * comp, user, site 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthSite> SSM090601(Map<String, Object> param);

	/**
	 * S_SM0906_02
	 * comp, user 필요 
	 * @param param
	 * @return
	 */
	List<SmAuthSite> SSM090602(Map<String, Object> param);

}
