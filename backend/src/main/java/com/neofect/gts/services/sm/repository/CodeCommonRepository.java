package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.CodeCommon;

/**
 * CodeCommonRepository
 * @author cm
 *
 */
public interface CodeCommonRepository {

	/**
	 * CODE_COM_LIST
	 * sysId, hcode 필요
	 * @param param
	 * @return
	 */
	List<CodeCommon> CODECOMLIST(Map<String, Object> param);
	
	/**
	 * CODE_COM_LIST2
	 * sysId, hcode 필요
	 * @param param
	 * @return
	 */
	List<CodeCommon> CODECOMLIST2(Map<String, Object> param);

}
