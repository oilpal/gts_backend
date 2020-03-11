package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmComCodeD;

/**
 * SmCodeTaxofficeRepository
 * @author cm
 *
 */
public interface SmComCodeDRepository {

	/**
	 * SM011900_dg_1
	 * hcode, sysId, useYn, value2 필요
 	 * @param param
	 * @return
	 */
	List<SmComCodeD> SM011900dg1(Map<String, Object> param);
	
	/**
	 * SM_COMCODE_D
	 * hcode, sysId 필요
	 * @param param
	 * @return
	 */
	List<SmComCodeD> SMCOMCODED(Map<String, Object> param);

	/**
	 * dddw_code
	 * hcode, sysId 필요
	 * @param param
	 * @return
	 */
	List<SmComCodeD> dddwcode(Map<String, Object> param);
	
	/**
	 * SM_COMCODE_D_W01
	 * @param param
	 * @return
	 */
	List<SmComCodeD> SMCOMCODEDW01(Map<String, Object> param);
	
	/**
	 * SM_COMCODE_D_R01
	 * @param param
	 * @return
	 */
	List<SmComCodeD> SMCOMCODEDR01(Map<String, Object> param);
	
	/**
	 * SM_COMCODE_D_D01
	 * lsHcode, lsSysId 필요
	 * @param param
	 * @return
	 */
	List<SmComCodeD> SMCOMCODEDD01(Map<String, Object> param);
	
	/**
	 * DDLB_BANK_CODE
	 * @param param
	 * @return
	 */
	List<SmComCodeD> DDLBBANKCODE(Map<String, Object> param);

}
