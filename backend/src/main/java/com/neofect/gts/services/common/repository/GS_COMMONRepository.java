package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.GS_COMMON;


/**
 * GS_COMMON Repository
 * @author jd
 *
 */
public interface GS_COMMONRepository {
	
	/**
	 * 최근 계약번호 가져오기
	 * @param gs
	 * @return
	 */
	int GET_MAX_CONTSEQ(Map<String, Object> gs);

	/**
	 * 고객 지사별 비고 수정
	 * @param gs
	 * @return
	 */
	int CODE_CUSTINDEPT_U01(Map<String, Object> gs);

	/**
	 * 고객 지사별 비고
	 * @param gs
	 * @return
	 */
	String CODE_CUSTINDEPT_R01(Map<String, Object> gs);

	/**
	 * 다음 순번의 고객ID를 반환
	 * @param gs
	 * @return
	 */
	List<GS_COMMON> NEXT_CUST_ID(GS_COMMON gs);

	/**
	 * 재가요양서비스 월 한도금액 가져오기 ( 등급 입력용 )
	 * @param gs
	 * @return
	 */
	List<GS_COMMON> GET_CARE_BASIC_AMT(GS_COMMON gs);

	/**
	 * 각종 마감 체크
	 * @param gs
	 * @return
	 */
	int CHK_CLOSING(GS_COMMON gs);

	/**
	 * 각종 마감 처리
	 * @param gs
	 * @return
	 */
	int CODE_CLOSING_U01(GS_COMMON gs);

	/**
	 * 서비스 product_id 가져오기
	 * @param gs
	 * @return
	 */
	List<GS_COMMON> GET_PRODUCT_ID(GS_COMMON gs);

	/**
	 * 다음 순번의 서비스ID를 반환
	 * @param gs
	 * @return
	 */
	String GET_SEQ_S_ID(GS_COMMON gs);

	/**
	 * SetRemainAmtCalc 사용
	 * @param gs
	 * @return
	 */
	List<GS_COMMON> SetRemainAmtCalc_R01(GS_COMMON gs);

	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<GS_COMMON> SetRemainAmtCalc_R02(GS_COMMON gs);

	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<GS_COMMON> SetRemainAmtCalc_R03(GS_COMMON gs);

}
