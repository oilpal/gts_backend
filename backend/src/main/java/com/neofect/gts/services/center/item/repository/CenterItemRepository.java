package com.neofect.gts.services.center.item.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.center.item.domain.CenterItem;

/**
 * 서비스 품목 관리 Repository
 * @author cm
 *
 */
public interface CenterItemRepository {

	
	/**
	 * 서비스 품목 관리 리스트
	 * HO01020_C01
	 * useyn, product, date 필요 
	 * @param param
	 * @return
	 */
	List<CenterItem> getServiceItemList(Map<String, Object> param);

	/**
	 * 품목 ID 반환
	 * GetDataProductId
	 * @param param
	 * @return
	 */
	List<CenterItem> getDataProductId(Map<String, Object> param);

	int insertCenterItemService(Map<String, Object> param);

}
