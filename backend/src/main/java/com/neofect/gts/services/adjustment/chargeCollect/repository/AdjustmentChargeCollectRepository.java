package com.neofect.gts.services.adjustment.chargeCollect.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.adjustment.chargeCollect.domain.AdjustmentChargeCollect;



/**
 * 본인 부담금 수금 Repository
 * @author ccm
 *
 */
public interface AdjustmentChargeCollectRepository {
	

	/**
	* 미수금현황
	* GS01080_R01
	* @param param
	* @return
	*/
	List<AdjustmentChargeCollect> getCARList(Map<String, Object> param);

	/**
	* 월별정산내역
	* GS01080_R02
	* @param gs
	* @return
	*/
	List<AdjustmentChargeCollect> getMSHList(Map<String, Object> param);

	/**
	* 입급내역
	* GS01080_C03
	* @param gs
	* @return
	*/
	List<AdjustmentChargeCollect> getDHList(Map<String, Object> param);

	/**
	* 급여비용명세서엑셀
	* GUBYEBIYONGXLS_R01
	* @param gs
	* @return
	*/
	List<AdjustmentChargeCollect> getSESList(Map<String, Object> param);

	
}
