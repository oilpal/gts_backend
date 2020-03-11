package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmAuthUserConfig;

/**
 * SmAuthUserConfigRepository
 * @author cm
 *
 */
public interface SmAuthUserConfigRepository {

	/**
	 * GET_CONFIG_LAYOUT
	 * comp, user 필요
	 * @param param
	 * @return
	 */
	List<SmAuthUserConfig> GETCONFIGLAYOUT(Map<String, Object> param);

	/**
	 * SET_CONFIG_LAYOUT
	 * comp, user, config필요
	 * @param param
	 * @return
	 */
	List<SmAuthUserConfig> SETCONFIGLAYOUT(Map<String, Object> param);

}
