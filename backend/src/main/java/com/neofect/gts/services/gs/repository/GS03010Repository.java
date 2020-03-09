package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS03010;


/**
 * 월별손익계산서 Repository
 * @author jd
 *
 */
public interface GS03010Repository {
	
	/**
    * 
    * @param gs
    * @return
    */
	List<GS03010> GS03010_R01(GS03010 gs);

	/**
    * 
    * @param gs
    * @return
    */
	List<GS03010> GS03010_R02(GS03010 gs);
	
}
