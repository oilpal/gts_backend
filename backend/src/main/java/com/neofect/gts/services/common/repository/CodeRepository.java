package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.Code;


/**
 * 코드 관리 Repository
 * @author jd
 *
 */
public interface CodeRepository {

	
	/**
	 * 공통코드목록
	 * SM_COMCODE_D, W_COMMON_01, W_COMMON_02
	 * sysId,hcode,useYn 필요 
	 * @param param
	 * @return
	 */
	List<Code> getSmCommonCodeList(Map<String,Object> param);


	/**
	 * 공통코드 목록 코드값 DValue2 로 
	 * 기존 SM_COMCODE_D_DV2
	 * @param param
	 * @return
	 */
	List<Code> getSmCommonCodeListByDvalue2(Map<String,Object> param);
	
	/**
	 * 공통코드 목록 by RelateCode
	 * 기존 SM_COMCODE_D_W
	 * @param param
	 * @return
	 */
	List<Code> getSmCommonCodeListDW(Map<String,Object> param);
	
	/**
	 * 첨부파일 갯수 
	 * 기존 SM_COMM_FILE_COUNT
	 * @param param
	 * @return
	 */
	int getSmCommonFileCount(Map<String,Object> param);
}
