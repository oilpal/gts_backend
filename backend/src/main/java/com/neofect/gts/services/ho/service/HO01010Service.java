package com.neofect.gts.services.ho.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.ho.domain.HO01010;
import com.neofect.gts.services.ho.repository.HO01010Repository;

/**
 * 오류 목록 체크 서비스
 * @author cm
 *
 */
@Service
public class HO01010Service {

	@Autowired
	HO01010Repository ho01010Repository;
	
	/**
	 * 오류 목록 체크 리스트
	 * @param param
	 * @return
	 */
	
	public List<HO01010> getErrorList(Map<String, Object> param) {
		return ho01010Repository.getErrorList(param);
	}
	
}
