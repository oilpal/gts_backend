package com.neofect.gts.services.ho.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.ho.domain.HO03040;
import com.neofect.gts.services.ho.repository.HO03040Repository;

/**
 * 사용자-센터권한설정
 * @author cm
 *
 */
@Service
public class HO03040Service {

	@Autowired
	HO03040Repository ho03040Repository;

	/**
	 * 사용자-센터권한 리스트
	 * @param param
	 * @return
	 */

	public List<HO03040> getSucpList(Map<String, Object> param) {
		return ho03040Repository.getSucpList(param);
	}

}
