package com.neofect.gts.services.gs.repository;

import java.util.List;

import com.neofect.gts.services.gs.domain.GS01010;


/**
 * 대상자 정보 관리 Repository
 * @author jd
 *
 */
public interface GS01010Repository {
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<GS01010> GS01010_C01(GS01010 gs);
	
	/**
	 * 담당센터정보
	 * @param gs
	 * @return
	 */
	List<GS01010> GS01010_U02(GS01010 gs);
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	int DEL_CODE_CUSTINDEPT(GS01010 gs);
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<GS01010> CHK_CODE_CUST(GS01010 gs);
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<GS01010> CODE_CUST_R01(GS01010 gs);
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	int CODE_CUSTINDEPT_C01(GS01010 gs);
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<GS01010> GS01010_R01(GS01010 gs);
	
	/**
	 * 
	 * @param gs
	 * @return
	 */
	List<GS01010> GS01012_C01(GS01010 gs);

}
