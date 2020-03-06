package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS02010;


/**
 * 직원관리 Repository
 * @author jd
 *
 */
public interface GS02010Repository {
	
	/**
    * 
    * @param gs
    * @return
    */
	List<GS02010> GS02010_C01(GS02010 gs);

	/**
    * 
    * @param gs
    * @return
    */
	List<GS02010> GET_ENC_RRN(GS02010 gs);

	/**
    * 
    * @param gs
    * @return
    */
	List<GS02010> SEQ_MEMBER_ID(GS02010 gs);

	/**
    * 주민번호 체크
    * @param gs
    * @return
    */
	List<GS02010> CHK_JUMIN(GS02010 gs);

	/**
    * 서비스 스케줄 체크
    * @param gs
    * @return
    */
	List<GS02010> CHK_SERVICE_SCHEDULE(GS02010 gs);

	/**
    * 다운로드용
    * @param gs
    * @return
    */
	List<GS02010> CODE_MEMBER_R02(GS02010 gs);
	
}
