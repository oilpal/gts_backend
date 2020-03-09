package com.neofect.gts.services.ho.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.ho.domain.HO03060;
import com.neofect.gts.services.ho.repository.HO03060Repository;

/**
 * 시스템마감관리
 * @author cm
 *
 */
@Service
public class HO03060Service {

	@Autowired
	HO03060Repository ho03060Repository;

	/**
	 * 시스템마감관리 리스트
	 * @param param
	 * @return
	 */

	public List<HO03060> getScmList(Map<String, Object> param) {
		return ho03060Repository.getScmList(param);
	}

}
