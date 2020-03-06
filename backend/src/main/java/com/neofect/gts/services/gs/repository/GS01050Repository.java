package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS01050;


/**
 * 월별일정/변경(방문) Repository
 * @author jd
 *
 */
public interface GS01050Repository {
	
	/**
    * 
    * @param gs
    * @return
    */
	List<GS01050> GS01050_C01(GS01050 gs);
	
	/**
    * 이동, 목욕서비스 초기값
    * @param gs
    * @return
    */
	List<GS01050> GET_CODE_PRODUCT_INI(GS01050 gs);
	
	/**
    * 월 일정삭제
    * @param gs
    * @return
    */
	int SERVICE_SCHEDULE_D01(GS01050 gs);
	
	/**
    * 월 일정삭제
    * @param gs
    * @return
    */
	int SERVICE_SCHEDULE_D02(GS01050 gs);
	
	/**
    * 월 일정삭제(한건)
    * @param gs
    * @return
    */
	int SERVICE_SCHEDULE_D03(GS01050 gs);
	
	/**
    * 장기요양등급
    * @param gs
    * @return
    */
	List<GS01050> GET_CUST_LEVEL_DIV(GS01050 gs);
	
	/**
    * 
    * @param gs
    * @return
    */
	List<GS01050> GET_SERVICEAMT(GS01050 gs);
	
	/**
    * 
    * @param gs
    * @return
    */
	List<GS01050> CODE_PRODUCT_R01(GS01050 gs);
	
	/**
    * 
    * @param gs
    * @return
    */
	List<GS01050> GET_SERVICESCHEDULE(GS01050 gs);
	
	/**
    * 달력좌측
    * @param gs
    * @return
    */
	List<GS01050> SERVICE_SUMMARY_SUM_R03(GS01050 gs);
	
	/**
    * 달력우측
    * @param gs
    * @return
    */
	List<GS01050> SERVICE_SUMMARY_SUM_R01(GS01050 gs);
	
	/**
    * 달력우측(합계)
    * @param gs
    * @return
    */
	List<GS01050> SERVICE_SUMMARY_SUM_R02(GS01050 gs);
	
	/**
    * 
    * @param gs
    * @return
    */
	List<GS01050> GET_LIMIT_AMT(GS01050 gs);
	
	/**
    * 
    * @param gs
    * @return
    */
	List<GS01050> GET_OFFICE_AMT(GS01050 gs);
	
	/**
    * 
    * @param gs
    * @return
    */
	List<GS01050> SM_CODE_CALENDAR_R01(GS01050 gs);
	
	/**
    * 중복센터 입력확인
    * @param gs
    * @return
    */
	List<GS01050> CHK_SERVICE_SCHEDULE_R01(GS01050 gs);
	
	/**
    * 가로 출력물 MAX SEQ 가져오기
    * @param gs
    * @return
    */
	List<GS01050> MAX_SEQ(GS01050 gs);
}
