package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS02030;


/**
 * 요양보호사별 서비스 일정 조회 Repository
 * @author jd
 *
 */
public interface GS02030Repository {
	
	/**
    * 
    * @param gs
    * @return
    */
	List<GS02030> GS02030_R01(GS02030 gs);

	/**
    * 
    * @param gs
    * @return
    */
	List<GS02030> GS02030_R02(GS02030 gs);

	/**
    * 
    * @param gs
    * @return
    */
	List<GS02030> GET_SERVICESCHEDULE(GS02030 gs);

	/**
    * 
    * @param gs
    * @return
    */
	List<GS02030> GET_SERVICE_MIN(GS02030 gs);

}
