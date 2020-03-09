package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SAPWBSREQ;

/**
 * SAPWBSREQRepository
 * @author cm
 *
 */
public interface SAPWBSREQRepository {

	/**
	 * C_SM0209_01
	 * zselo, find, pspst 필요
	 * @param param
	 * @return
	 */     
	List<SAPWBSREQ> CSM020901(Map<String, Object> param);
	
	/**
	 * S_SM0209_02
	 * @param param
	 * @return
	 */     
	List<SAPWBSREQ> SSM020902(Map<String, Object> param);
	
	/**
	 * D_SM0209_03
	 * bussno 필요
	 * @param param
	 * @return
	 */     
	List<SAPWBSREQ> DSM020903(Map<String, Object> param);

}
