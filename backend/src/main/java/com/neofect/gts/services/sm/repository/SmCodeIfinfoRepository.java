package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmCodeIfinfo;

/**
 * SmCodeIfinfoRepository
 * @author cm
 *
 */
public interface SmCodeIfinfoRepository {

	/**
	 * R_SM_CODE_IFINFO_01
	 * ifSys 필요
	 * @param param
	 * @return
	 */ 
	List<SmCodeIfinfo> RSMCODEIFINFO01(Map<String, Object> param);

	/**
	 * R_SM_CODE_IFINFO_02
	 * ifSys, ifCode 필요
	 * @param param
	 * @return
	 */ 
	List<SmCodeIfinfo> RSMCODEIFINFO02(Map<String, Object> param);

}
