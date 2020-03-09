package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmFindCode;

/**
 * SmFindCode Repository
 * @author cm
 *
 */
public interface SmFindCodeRepository {

	/**
	 * 
	 * @param param
	 * @return
	 */
	List<SmFindCode> FindPgmCode(Map<String, Object> param);

	/**
	 *   
	 * @param param
	 * @return
	 */
	List<SmFindCode> FindFmStdEquip(Map<String, Object> param);
	
	/**
	 *   
	 * @param param
	 * @return
	 */
	List<SmFindCode> FindFmEquipDiagType(Map<String, Object> param);
	
	/**
	 *   
	 * @param param
	 * @return
	 */
	List<SmFindCode> FindSmAuthGroup(Map<String, Object> param);
	
	/**
	 *   
	 * @param param
	 * @return
	 */
	List<SmFindCode> FindUserGroupCode(Map<String, Object> param);
	
	/**
	 *   
	 * @param param
	 * @return
	 */
	List<SmFindCode> FindAuthUser(Map<String, Object> param);
	
	/**
	 * [조경] 분류코드 
	 * @param param
	 * @return
	 */
	List<SmFindCode> FindL_Code(Map<String, Object> param);
	
}
