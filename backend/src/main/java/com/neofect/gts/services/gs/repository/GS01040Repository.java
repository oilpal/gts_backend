package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS01040;


/**
 * 월별일정/변경(방문) Repository
 * @author jd
 *
 */
public interface GS01040Repository {
	
	/**
    * 
    * @param gs
    * @return
    */
    List<GS01040> GS01040_C01(GS01040 gs);
    
    /**
    * 월 일정삭제
    * @param gs
    * @return
    */
    int SERVICE_SCHEDULE_D01(GS01040 gs);
    
    /**
    * 월 일정삭제
    * @param gs
    * @return
    */
    int SERVICE_SCHEDULE_D02(GS01040 gs);
    
    /**
    * 월 일정삭제(한건)
    * @param gs
    * @return
    */
    int SERVICE_SCHEDULE_D03(GS01040 gs);
    
    /**
    *
    * @param gs
    * @return
    */
    List<GS01040> GET_SERVICEAMT(GS01040 gs);
    
    /**
    *
    * @param gs
    * @return
    */
    List<GS01040> CODE_PRODUCT_R01(GS01040 gs);
    
    /**
    *
    * @param gs
    * @return
    */
    List<GS01040> GET_SERVICESCHEDULE(GS01040 gs);
    
    /**
    * 달력좌측
    * @param gs
    * @return
    */
    List<GS01040> SERVICE_SUMMARY_SUM_R03(GS01040 gs);
    
    /**
    * 달력우측
    * @param gs
    * @return
    */
    List<GS01040> SERVICE_SUMMARY_SUM_R01(GS01040 gs);
    
    /**
    * 달력우측(합계)
    * @param gs
    * @return
    */
    List<GS01040> SERVICE_SUMMARY_SUM_R02(GS01040 gs);
    
    /**
    *
    * @param gs
    * @return
    */
    List<GS01040> GET_LIMIT_AMT(GS01040 gs);
    
    /**
    *
    * @param gs
    * @return
    */
    List<GS01040> GET_OFFICE_AMT(GS01040 gs);
    
    /**
    *
    * @param gs
    * @return
    */
    List<GS01040> SM_CODE_CALENDAR_R01(GS01040 gs);
    
    /**
    * 중복센터 입력확인
    * @param gs
    * @return
    */
    List<GS01040> CHK_SERVICE_SCHEDULE_R01(GS01040 gs);
    
    /**
    * 가로 출력물 MAX SEQ 가져오기
    * @param gs
    * @return
    */
    List<GS01040> MAX_SEQ(GS01040 gs);
}
