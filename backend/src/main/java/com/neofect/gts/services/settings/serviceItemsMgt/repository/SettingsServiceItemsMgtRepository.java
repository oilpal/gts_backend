package com.neofect.gts.services.settings.serviceItemsMgt.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.settings.serviceItemsMgt.domain.ServiceItemsMgt;

/**
 * 서비스 품목 관리 Repository
 * @author cm
 *
 */
public interface SettingsServiceItemsMgtRepository {

	
	/**
	 * 서비스 품목 관리 리스트
	 * HO01020_C01
	 * useyn, product, date 필요 
	 * @param param
	 * @return
	 */
	List<ServiceItemsMgt> getServiceItemList(Map<String, Object> param);

	/**
	 * 품목 ID 반환
	 * GetDataProductId
	 * @param param
	 * @return
	 */
	List<ServiceItemsMgt> getDataProductId(Map<String, Object> param);

	int insertCenterItemService(Map<String, Object> param);

}
