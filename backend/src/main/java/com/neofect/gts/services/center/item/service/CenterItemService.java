package com.neofect.gts.services.center.item.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.center.item.domain.CenterItem;
import com.neofect.gts.services.center.item.repository.CenterItemRepository;

/**
 * 서비스 품목관리
 * @author cm
 *
 */
@Service
public class CenterItemService {

	@Autowired
	CenterItemRepository centerItemRepository;
	
	/**
	 * 오류 목록
	 * @param param
	 * @return
	 */
	
	public List<CenterItem> getServiceItemList(Map<String, Object> param) {
		return centerItemRepository.getServiceItemList(param);
	}

	public int insertCenterItemService(Map<String, Object> param) {
		return centerItemRepository.insertCenterItemService(param);
	}
	
}
