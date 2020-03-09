package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS01020;


/**
 * 서비스 계약 관리 Repository
 * @author jd
 *
 */
public interface GS01020Repository {
	
	/**
	 * 대상자목록
	 * @param gs
	 * @return
	 */
	List<GS01020> GS01020_R01(GS01020 gs);

	/**
	 * 계약히스토리
	 * @param gs
	 * @return
	 */
	List<GS01020> GS01020_C02(GS01020 gs);

	/**
	 * 서비스일정
	 * @param gs
	 * @return
	 */
	List<GS01020> GS01020_R03(GS01020 gs);

	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<GS01020> GS01020_C04(GS01020 gs);

	/**
	 * 
	 * @param gs
	 * @return
	 */
	int SERVICE_CONTRACT_U01(GS01020 gs);

	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<GS01020> MAX_CONT_SEQ(GS01020 gs);

	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<GS01020> CODE_CUST_R01(GS01020 gs);

	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<GS01020> CODE_CUST_R02(GS01020 gs);

}
