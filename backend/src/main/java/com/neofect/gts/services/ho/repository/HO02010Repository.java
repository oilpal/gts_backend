package com.neofect.gts.services.ho.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.ho.domain.HO02010;
import com.neofect.gts.services.settings.errorEventMgt.domain.ErrorEventMgt;

/**
 * 입퇴사자 관리 Repository
 * @author cm
 *
 */
public interface HO02010Repository {

	/**
	 * 입퇴사자 관리 리스트
	 * HO02010_U01
	 * dept, gubundiv, workyn, emptychk, form, to, alldate, name 필요 
	 * @param param
	 * @return
	 */
	List<HO02010> getResList(Map<String, Object> param);
	
	/**
	 * 입퇴사자 관리 리스트 다른 쿼리
	 * HO02010_R02
	 * dept, yymm, cust, member 필요 
	 * @param param
	 * @return
	 */
	List<ErrorEventMgt> ho02010R02(Map<String, Object> param);
}
