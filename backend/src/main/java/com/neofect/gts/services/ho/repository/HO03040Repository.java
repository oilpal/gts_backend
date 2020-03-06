package com.neofect.gts.services.ho.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.ho.domain.HO03040;

/**
 * 사용자-센터권한설정 Repository
 * @author cm
 *
 */
public interface HO03040Repository {

	/**
	 * 사용자-센터권한 리스트
	 * deptid, workYn 필요 
	 * @param param
	 * @return
	 */
	List<HO03040> getSucpList(Map<String, Object> param);
	
	/**
	 * HO03040_C02
	 * id 필요 
	 * @param param
	 * @return
	 */
	List<HO03040> HO03040C02(Map<String, Object> param);

}
