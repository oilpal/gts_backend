package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS01080;


/**
 * 고객별 서비스 이용내역 Repository
 * @author jd
 *
 */
public interface GS01080Repository {
	
	/**
	* 미수금현황
	* @param gs
	* @return
	*/
	List<GS01080> GS01080_R01(GS01080 gs);

	/**
	* 월별정산내역
	* @param gs
	* @return
	*/
	List<GS01080> GS01080_R02(GS01080 gs);

	/**
	* 입급내역
	* @param gs
	* @return
	*/
	List<GS01080> GS01080_C03(GS01080 gs);

	/**
	* 급여비용명세서엑셀
	* @param gs
	* @return
	*/
	List<GS01080> GUBYEBIYONGXLS_R01(GS01080 gs);	
}
