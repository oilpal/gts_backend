package com.neofect.gts.services.ho.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.ho.domain.HO02030;

/**
 * 직원식브 일괄변경 Repository
 * @author cm
 *
 */
public interface HO02030Repository {

	/**
	 * 직원식브 일괄변경 리스트
	 * HO02030_U01
	 * * dept, paydiv, hourpay 필요 
	 * @param param
	 * @return
	 */
	List<HO02030> getHpayList(Map<String, Object> param);

}
