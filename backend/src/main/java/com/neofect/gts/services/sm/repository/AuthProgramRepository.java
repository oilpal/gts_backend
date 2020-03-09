package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.AuthMenu;
import com.neofect.gts.services.sm.domain.AuthProgram;

/**
 * AuthProgramRepository
 * @author cm
 *
 */
public interface AuthProgramRepository {


	/**
	 * Auth_Program_E01
	 * sysId, pgmNm 필요
	 * @param param
	 * @return
	 */   
	List<AuthProgram> AuthProgramE01(Map<String, Object> param);
	
	/**
	 * Auth_Program_S01
	 * pgmCode 필요
	 * @param param
	 * @return
	 */   
	List<AuthProgram> AuthProgramS01(Map<String, Object> param);
	
	/**
	 * MyPgmList_S01
	 * authCode 필요
	 * @param param
	 * @return
	 */   
	List<AuthProgram> MyPgmListS01(Map<String, Object> param);
	
}
