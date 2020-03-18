package com.neofect.gts.services.account.serviceContract.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.account.serviceContract.domain.AccountServiceContract;


/**
 * 서비스 계약 관리 Repository
 * @author jd
 *
 */
public interface AccountServiceContractRepository {
	
	/**
	 * 대상자목록
	 * @param gs
	 * @return
	 */
	List<AccountServiceContract> GS01020_R01(Map<String, Object> gs);

	/**
	 * 계약히스토리
	 * @param gs
	 * @return
	 */
	List<AccountServiceContract> GS01020_C02(Map<String, Object> gs);

	/**
	 * 서비스일정
	 * @param gs
	 * @return
	 */
	List<AccountServiceContract> GS01020_R03(Map<String, Object> gs);

	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<AccountServiceContract> GS01020_C04(Map<String, Object> gs);

	/**
	 * 
	 * @param gs
	 * @return
	 */
	int SERVICE_CONTRACT_U01(Map<String, Object> gs);

	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<AccountServiceContract> MAX_CONT_SEQ(Map<String, Object> gs);

	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<AccountServiceContract> CODE_CUST_R01(Map<String, Object> gs);

	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<AccountServiceContract> CODE_CUST_R02(Map<String, Object> gs);

}
