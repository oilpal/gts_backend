package com.neofect.gts.services.settings.serviceItemsMgt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.settings.serviceItemsMgt.domain.ServiceItemsMgt;
import com.neofect.gts.services.settings.serviceItemsMgt.repository.SettingsServiceItemsMgtRepository;


/**
 * 서비스 품목관리
 * @author cm
 *
 */
@Service
public class SettingsServiceItemsMgtService {

	@Autowired
	SettingsServiceItemsMgtRepository serviceItemsMgtRepository;
	
	/**
	 * 오류 목록
	 * @param param
	 * @return
	 */
	
	public List<ServiceItemsMgt> getServiceItemList(Map<String, Object> param) {
		return serviceItemsMgtRepository.getServiceItemList(param);
	}

	public int insertCenterItemService(Map<String, Object> param) {
		return serviceItemsMgtRepository.insertCenterItemService(param);
	}
	
}
