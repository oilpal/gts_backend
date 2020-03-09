package com.neofect.gts.services.ho.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.ho.domain.HO03050;
import com.neofect.gts.services.ho.repository.HO03050Repository;

/**
 * 요양비용관리
 * @author cm
 *
 */
@Service
public class HO03050Service {

	@Autowired
	HO03050Repository ho03050Repository;

	/**
	 * 요양비용관리 리스트
	 * @param param
	 * @return
	 */

	public List<HO03050> getCcmList(Map<String, Object> param) {
		return ho03050Repository.getCcmList(param);
	}

}
