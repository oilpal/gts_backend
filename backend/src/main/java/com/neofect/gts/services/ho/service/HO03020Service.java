package com.neofect.gts.services.ho.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.ho.domain.HO03020;
import com.neofect.gts.services.ho.repository.HO03020Repository;

/**
 * 센터 관리
 * @author cm
 *
 */
@Service
public class HO03020Service {

	@Autowired
	HO03020Repository ho03020Repository;

	/**
	 * 센터 관리 리스트
	 * @param param
	 * @return
	 */
	public List<HO03020> getCenterList(Map<String, Object> param) {
		return ho03020Repository.getCenterList(param);
	}

}
