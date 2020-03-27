package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.Common;

public interface CommonRepository {

	List<Common> SM_COMCODE_D(Map<String,Object> param);

	/**
	 * [사용]
	 * @param param
	 * @return
	 */
	@Deprecated
	List<Common> SM_COMCODE_D_DV2(Map<String,Object> param);

	List<Common> SM_COMCODE_D_W(Map<String,Object> param);

	List<Common> SM_CUST_SETCOMBO(Map<String,Object> param);

	List<Common> W_COMMON_01(Map<String,Object> param);

	List<Common> W_COMMON_02(Map<String,Object> param);

	List<Common> SM_COMM_FILE_COUNT(Map<String,Object> param);

	List<Common> DAYS_FOR_MONTH(Map<String,Object> param);

	List<Common> MENU_RECENT(Map<String,Object> param);

	List<Common> SM_CUST_VENDOR(Map<String,Object> param);

	List<Common> SM_CUST_VENDOR_PROC(Map<String,Object> param);

	List<Common> AC_ACNT_CODE_FIND(Map<String,Object> param);

	List<Common> HR_CODE_BANK(Map<String,Object> param);

	List<Common> CheckSysMaster(Map<String,Object> param);

	List<Common> EXCEL_FILE_NUM(Map<String,Object> param);

	List<Common> GET_EMAIL(Map<String,Object> param);

	List<Common> SM_USERINFO(Map<String,Object> param);

	List<Common> AUTH_ACT_01(Map<String,Object> param);

	List<Common> FIRST_SUNDAY(Map<String,Object> param);

	List<Common> SM_COMM_FILE_PATH(Map<String,Object> param);

	List<Common> BM_COMM_DETAIL(Map<String,Object> param);

	/**
	 * [사용]
	 * @param param
	 * @return
	 */
	@Deprecated
	List<Common> CODE_COMDIV(Map<String,Object> param);

	List<Common> CODE_COMDIV4(Map<String,Object> param);

	List<Common> XM_EXCEL_DATA_D01(Map<String,Object> param);

	List<Common> CODE_DEPT_AUTHORITY_R01(Map<String,Object> param);

	List<Common> GET_DEPT_NAME(Map<String,Object> param);

	List<Common> GET_ENC_RRN(Map<String,Object> param);

	List<Common> MONTH_INFO(Map<String,Object> param);

	List<Common> DDLB_CODE_PRODUCT(Map<String,Object> param);

	List<Common> DDLB_CODE_PRODUCT2(Map<String,Object> param);

	List<Common> DDLB_DEPT_DEPOSITNO(Map<String,Object> param);

	List<Common> DDLB_CUST_DEPOSITNO(Map<String,Object> param);

	List<Common> GET_AUTHORITY_DIV(Map<String,Object> param);

	List<Common> GET_ENCRYPT(Map<String,Object> param);

	List<Common> CHK_CUR_PASS(Map<String,Object> param);
	
}
