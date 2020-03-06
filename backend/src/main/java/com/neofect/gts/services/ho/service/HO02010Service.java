package com.neofect.gts.services.ho.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.ho.domain.HO02010;
import com.neofect.gts.services.ho.repository.HO02010Repository;

/**
 * 입퇴사자 관리
 * @author cm
 *
 */
@Service
public class HO02010Service {

	@Autowired
	HO02010Repository ho02010Repository;
	
	/**
	 * 입퇴사자 관리 리스트
	 * @param param
	 * @return
	 */
	
	public List<HO02010> getResList(Map<String, Object> param) {
		return ho02010Repository.getResList(param);
	}
	
}
