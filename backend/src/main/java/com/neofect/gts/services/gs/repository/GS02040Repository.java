package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS02040;


/**
 * 요양서비스 일정 조회 Repository
 * @author jd
 *
 */
public interface GS02040Repository {
	
	/**
    * 
    * @param gs
    * @return
    */
	List<GS02040> GS02040_R01(GS02040 gs);

	/**
    * 
    * @param gs
    * @return
    */
	List<GS02040> GET_SERVICESCHEDULE(GS02040 gs);
	
	/**
    * 
    * @param gs
    * @return
    */
	List<GS02040> GS02041_R01(GS02040 gs);

}
