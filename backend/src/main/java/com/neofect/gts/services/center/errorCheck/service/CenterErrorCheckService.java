package com.neofect.gts.services.center.errorCheck.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.center.errorCheck.domain.ErrorCheck;
import com.neofect.gts.services.center.errorCheck.repository.CenterErrorCheckRepository;

/**
 * 오류 목록 체크
 * @author ccm
 *
 */
@Service
public class CenterErrorCheckService {

	@Autowired
	CenterErrorCheckRepository centerErrorCheckRepository;


	/**
	 * 오류 목록 체크 리스트
	 * @param param
	 * @return
	 */
	
	public List<ErrorCheck> getErrorList(Map<String, Object> param) {
		return centerErrorCheckRepository.getErrorList(param);
	}

	/**
	 * 오류 리스트
	 * @param param
	 * @return
	 */
	
	public List<ErrorCheck> getErrorDetail(Map<String, Object> param) {
		return centerErrorCheckRepository.getErrorDetail(param);
	}
	


}
