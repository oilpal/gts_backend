package com.neofect.gts.services.ho.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.ho.domain.HO03010;
import com.neofect.gts.services.ho.repository.HO03010Repository;

/**
 * 임직원 관리
 * @author cm
 *
 */
@Service
public class HO03010Service {

	@Autowired
	HO03010Repository ho03010Repository;
	
	/**
	 * 임직원 관리 리스트
	 * @param param
	 * @return
	 */
	
	public List<HO03010> getEmpManageList(Map<String, Object> param) {
		return ho03010Repository.getEmpManageList(param);
	}
	
}
