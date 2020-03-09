package com.neofect.gts.services.ho.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.ho.domain.HO01020;

/**
 * 서비스 품목 관리 Repository
 * @author cm
 *
 */
public interface HO01020Repository {

	
	/**
	 * 서비스 품목 관리 리스트
	 * HO01020_C01
	 * useyn, product, date 필요 
	 * @param param
	 * @return
	 */
	List<HO01020> getServiceItemList(Map<String, Object> param);

	/**
	 * 품목 ID 반환
	 * GetDataProductId
	 * @param param
	 * @return
	 */
	List<HO01020> getDataProductId(Map<String, Object> param);

}
