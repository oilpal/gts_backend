package com.neofect.gts.services.settings.errorEventMgt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.settings.errorEventMgt.domain.ErrorEventMgt;
import com.neofect.gts.services.settings.errorEventMgt.repository.SettingsErrorEventMgtRepository;


/**
 * 오류 목록 체크
 * @author ccm
 *
 */
@Service
public class SettingsErrorEventMgtService {

	@Autowired
	SettingsErrorEventMgtRepository settingsErrorEventMgtRepository;


	/**
	 * 오류 목록 체크 리스트
	 * @param param
	 * @return
	 */
	
	public List<ErrorEventMgt> getErrorList(Map<String, Object> param) {
		return settingsErrorEventMgtRepository.getErrorList(param);
	}

	/**
	 * 오류 리스트
	 * @param param
	 * @return
	 */
	
	public List<ErrorEventMgt> getErrorDetail(Map<String, Object> param) {
		return settingsErrorEventMgtRepository.getErrorDetail(param);
	}
	


}
