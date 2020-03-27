package com.neofect.gts.services.accounthing.billing.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.accounthing.billing.domain.AccounthingBilling;




/**
 * 고객청구현황 Repository
 * @author jd
 *
 */
public interface AccounthingBillingRepository {
	
	/**
	*
	* @param param
	* @return
	*/
	List<AccounthingBilling> GS01060_R01(Map<String, Object> param);

	/**
	*
	* @param param
	* @return
	*/
	List<AccounthingBilling> GS01060_C02(Map<String, Object> param);

	/**
	*
	* 가산율 추가
	* @param q
	* @return
	*/
	int updateAdditionRate(Map<String, Object> q);
}
