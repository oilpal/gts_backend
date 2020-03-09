package com.neofect.gts.services.ho.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.ho.domain.HO02030;
import com.neofect.gts.services.ho.repository.HO02020Repository;
import com.neofect.gts.services.ho.repository.HO02030Repository;

/**
 * 직원시급 일괄변경
 * @author cm
 *
 */
@Service
public class HO02030Service {

	@Autowired
	HO02030Repository ho02030Repository;
	
	/**
	 * 직원시급 일괄변경 리스트
	 * @param param
	 * @return
	 */
	
	public List<HO02030> getHpayList(Map<String, Object> param) {
		return ho02030Repository.getHpayList(param);
	}
	
}
