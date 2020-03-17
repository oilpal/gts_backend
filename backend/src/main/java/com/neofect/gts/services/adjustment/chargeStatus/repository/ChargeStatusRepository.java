package com.neofect.gts.services.adjustment.chargeStatus.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.gs.domain.ChargeStatus;


/**
 * 고객청구현황 Repository
 * @author jd
 *
 */
public interface ChargeStatusRepository {
	
	/**
	*
	* @param param
	* @return
	*/
	List<ChargeStatus> GS01060_R01(Map<String, Object> param);

	/**
	*
	* @param param
	* @return
	*/
	List<ChargeStatus> GS01060_C02(Map<String, Object> param);

	/**
	*
	* 가산율 추가
	* @param q
	* @return
	*/
	int updateAdditionRate(Map<String, Object> q);
}
