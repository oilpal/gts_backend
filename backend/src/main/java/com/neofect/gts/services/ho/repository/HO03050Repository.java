package com.neofect.gts.services.ho.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.ho.domain.HO03050;

/**
 * 요양비용관리 Repository
 * @author cm
 *
 */
public interface HO03050Repository {

	/**
	 * 요양비용관리 리스트
	 * HO03050_C01 
	 * @param param
	 * @return
	 */
	List<HO03050> getCcmList(Map<String, Object> param);

}
