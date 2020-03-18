package com.neofect.gts.services.account.info.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.account.info.domain.AccountInfo;


/**
 * 대상자 정보 관리 Repository
 * @author jd
 *
 */
public interface AccountInfoRepository {
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<AccountInfo> GS01010_C01(Map<String, Object> gs);
	
	/**
	 * 담당센터정보
	 * @param gs
	 * @return
	 */
	List<AccountInfo> GS01010_U02(Map<String, Object> gs);
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	int DEL_CODE_CUSTINDEPT(Map<String, Object> gs);
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<AccountInfo> CHK_CODE_CUST(Map<String, Object> gs);
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<AccountInfo> CODE_CUST_R01(Map<String, Object> gs);
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	int CODE_CUSTINDEPT_C01(Map<String, Object> gs);
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<AccountInfo> GS01010_R01(Map<String, Object> gs);
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<AccountInfo> GS01012_C01(Map<String, Object> gs);

}
