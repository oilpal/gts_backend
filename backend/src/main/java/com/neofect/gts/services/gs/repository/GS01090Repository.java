package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS01090;


/**
 * 대상자 주별일정/변경 Repository
 * @author jd
 *
 */
public interface GS01090Repository {
	
	/**
	    * 
	    * @param gs
	    * @return
	    */
		List<GS01090> GS01090_C01(GS01090 gs);
		
		/**
	    * 
	    * @param gs
	    * @return
	    */
		List<GS01090> GET_SERVICESCHEDULE(GS01090 gs);
		
		/**
	    * 
	    * @param gs
	    * @return
	    */
		List<GS01090> GET_SERVICESCHEDULE_R01(GS01090 gs);
		
		/**
	    * 
	    * @param gs
	    * @return
	    */
		List<GS01090> SM_CODE_CALENDAR_R01(GS01090 gs);
		
		/**
	    * 
	    * @param gs
	    * @return
	    */
		List<GS01090> GET_SERVICEAMT_EXTRA3(GS01090 gs);
		
		/**
	    * 
	    * @param gs
	    * @return
	    */
		List<GS01090> GET_SERVICEAMT_X(GS01090 gs);
		
		/**
	    * 
	    * @param gs
	    * @return
	    */
		List<GS01090> GET_SERVICEAMT(GS01090 gs);
		
		/**
	    * 
	    * @param gs
	    * @return
	    */
		List<GS01090> FAMILY_YN(GS01090 gs);
		
		/**
	    * 
	    * @param gs
	    * @return
	    */
		List<GS01090> CUST_LEVEL_DIV(GS01090 gs);
	
}
