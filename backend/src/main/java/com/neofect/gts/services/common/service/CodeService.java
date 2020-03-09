package com.neofect.gts.services.common.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.domain.Code;
import com.neofect.gts.services.common.repository.CodeRepository;

/**
 * 코드 서비스 
 * @author jd
 *
 */
@Service
public class CodeService {

	@Autowired
	CodeRepository codeRepository;
	
	/**
	 * 공통코드 목록
	 * @param param
	 * @return
	 */
	public List<Code> getSmCommonCodeList( Map<String,Object> param){
		return codeRepository.getSmCommonCodeList(param);
	}
}
