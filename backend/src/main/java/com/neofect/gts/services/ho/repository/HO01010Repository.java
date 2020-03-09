package com.neofect.gts.services.ho.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.ho.domain.HO01010;

/**
 * 오류 목록 체크 Repository
 * @author cm
 *
 */
public interface HO01010Repository {
	
	/**
	 * 오류 목록 체크 리스트
	 * HO01010_R01
	 * yymm 필요 
	 * @param param
	 * @return
	 */
	List<HO01010> getErrorList(Map<String, Object> param);

	/**
	 * 오류 목록 체크 상세
	 * HO01010_R02
	 * dept, yymm, cust, member 필요 
	 * @param param
	 * @return
	 */
	List<HO01010> getErrorDetail(Map<String, Object> param);

}
