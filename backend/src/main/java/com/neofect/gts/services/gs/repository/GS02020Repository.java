package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS02020;


/**
 * 급여관리 Repository
 * @author jd
 *
 */
public interface GS02020Repository {
	
	/**
    * 
    * @param gs
    * @return
    */
	List<GS02020> GS02020_C01(GS02020 gs);

	/**
    * 
    * @param gs
    * @return
    */
	List<GS02020> GS02020_C02(GS02020 gs);

	/**
    * 
    * @param gs
    * @return
    */
	List<GS02020> GS02020_R03(GS02020 gs);

}
