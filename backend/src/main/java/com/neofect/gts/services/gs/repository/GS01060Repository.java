package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS01060;


/**
 * (구)이용계약서 Repository
 * @author jd
 *
 */
public interface GS01060Repository {
	
	/**
	*
	* @param gs
	* @return
	*/
	List<GS01060> GS01060_R01(GS01060 gs);

	/**
	*
	* @param gs
	* @return
	*/
	List<GS01060> GS01060_C02(GS01060 gs);
}
