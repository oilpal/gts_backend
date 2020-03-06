package com.neofect.gts.services.ho.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.ho.domain.HO02020;
import com.neofect.gts.services.ho.repository.HO02020Repository;

/**
 * 간이세액 조견표
 * @author cm
 *
 */
@Service
public class HO02020Service {

	@Autowired
	HO02020Repository ho02020Repository;
	
	/**
	 * 간이세액 조견표 리스트
	 * @param param
	 * @return
	 */
	
	public List<HO02020> getSimpleTaxList(Map<String, Object> param) {
		return ho02020Repository.getSimpleTaxList(param);
	}
	
}
