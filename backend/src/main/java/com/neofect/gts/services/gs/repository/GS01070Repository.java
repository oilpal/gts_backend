package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS01070;


/**
 * 고객별 서비스 이용내역 Repository
 * @author jd
 *
 */
public interface GS01070Repository {
	
	/**
	*
	* @param gs
	* @return
	*/
	List<GS01070> GS01070_R01(GS01070 gs);	
}
