package com.neofect.gts.services.settings.errorEventMgt.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.settings.errorEventMgt.domain.ErrorEventMgt;


/**
 * 오류 목록 체크 Repository
 * @author cm
 *
 */
public interface SettingsErrorEventMgtRepository {


	/**
	 * 오류 목록 체크 리스트
	 * HO01010_R01
	 * yymm 필요 
	 * @param param
	 * @return
	 */
	List<ErrorEventMgt> getErrorList(Map<String, Object> param);

	/**
	 * 오류 목록 체크 상세
	 * HO01010_R02
	 * dept, yymm, cust, member 필요 
	 * @param param
	 * @return
	 */
	List<ErrorEventMgt> getErrorDetail(Map<String, Object> param);
	
}
