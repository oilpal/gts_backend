package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM0103;

/**
 * SM0103Repository
 * @author cm
 *
 */
public interface SM0103Repository {

	/**
	 * BM_COMM_MASTER_C01
	 * comp, hname 필요
	 * @param param
	 * @return
	 */   
	List<SM0103> BMCOMMMASTERC01(Map<String, Object> param);
	
	/**
	 * BM_COMM_DETAIL_C01
	 * comp, hcode 필요
	 * @param param
	 * @return
	 */   
	List<SM0103> BMCOMMDETAILC01(Map<String, Object> param);

}
