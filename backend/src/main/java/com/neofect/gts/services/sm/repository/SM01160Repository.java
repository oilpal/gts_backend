package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM01160;

/**
 * SM01160Repository
 * @author cm
 *
 */
public interface SM01160Repository {
	  
	  /**
	  * 
	  * @param param
	  * @return
	  */ 
	  List<SM01160> SM01160_01(Map<String, Object> param);

	  /**
	  * 
	  * @param param
	  * @return
	  */ 
	  List<SM01160> SM01160_02(Map<String, Object> param);

	  /**
	  * 
	  * @param param
	  * @return
	  */ 
	  List<SM01160> SM01160_03(Map<String, Object> param);

	  /**
	  * 
	  * @param param
	  * @return
	  */ 
	  List<SM01160> SM01160_R02(Map<String, Object> param);

	  /**
	  * 
	  * @param param
	  * @return
	  */ 
	  int SM01160_I01(Map<String, Object> param);

	  /**
	  * 
	  * @param param
	  * @return
	  */ 
	  List<SM01160> GET_PGM_LEV2(Map<String, Object> param);

}
