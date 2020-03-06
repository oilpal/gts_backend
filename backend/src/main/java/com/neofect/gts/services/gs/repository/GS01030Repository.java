package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS01030;


/**
 * (구)이용계약서 Repository
 * @author jd
 *
 */
public interface GS01030Repository {
	
	/**
	*
	* @param gs
	* @return
	*/
	List<GS01030> GS01030_C01(GS01030 gs);

	/**
	*
	* @param gs
	* @return
	*/
	List<GS01030> GS01030_C02(GS01030 gs);

	/**
	*
	* @param gs
	* @return
	*/
	List<GS01030> SEQ_FORM_CONTRACT(GS01030 gs);

	/**
	*
	* @param gs
	* @return
	*/
	List<GS01030> CODE_DEPT_R01(GS01030 gs);

	/**
	*
	* @param gs
	* @return
	*/
	List<GS01030> CODE_CUST_R01(GS01030 gs);

}
