package com.neofect.gts.services.ho.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.ho.domain.HO01020;
import com.neofect.gts.services.ho.repository.HO01020Repository;

/**
 * 서비스 품목관리
 * @author cm
 *
 */
@Service
public class HO01020Service {

	@Autowired
	HO01020Repository ho01020Repository;
	
	/**
	 * 오류 목록
	 * @param param
	 * @return
	 */
	
	public List<HO01020> getServiceItemList(Map<String, Object> param) {
		return ho01020Repository.getServiceItemList(param);
	}
	
}
