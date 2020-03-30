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
	
	/**
	 * 공통코드 목록 CODE_COMDIV
	 * @param param
	 * @return
	 */
	public List<Code> selectCodeComdivList(Map<String,Object> param){
		return codeRepository.selectCodeComdivList(param);
	}
	
	/**
	 * 공통코드 목록 코드값 DValue2 로 
	 * 기존 SM_COMCODE_D_DV2
	 * @param param
	 * @return
	 */
	public List<Code> selectSmCommonCodeListByDvalue2(Map<String,Object> param){
		return codeRepository.selectSmCommonCodeListByDvalue2(param);
	}
	
	/**
	 * 사용자별지사코드 CODE_DEPT_AUTHORITY_R01
	 * @param param
	 * @return
	 */
	public List<Code> selectCodeDeptAuthorityListR01(Map<String,Object> param){
		return codeRepository.selectCodeDeptAuthorityListR01(param);
	}
}
