package com.neofect.gts.services.ho.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.ho.domain.HO03020;
import com.neofect.gts.services.ho.domain.HO03030;
import com.neofect.gts.services.ho.repository.HO03020Repository;
import com.neofect.gts.services.ho.repository.HO03030Repository;

/**
 * 센터 데이터 복사
 * @author cm
 *
 */
@Service
public class HO03030Service {

	@Autowired
	HO03030Repository ho03030Repository;

	/**
	 * HO03030_R01
	 * @param param
	 * @return
	 */

	public List<HO03030> getCenterCopyList(Map<String, Object> param) {
		
		return ho03030Repository.getCenterCopyList(param);
	}

}
