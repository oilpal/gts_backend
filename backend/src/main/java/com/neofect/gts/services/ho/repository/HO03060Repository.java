package com.neofect.gts.services.ho.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.ho.domain.HO03060;

/**
 * 시스템마감관리 Repository
 * @author cm
 *
 */
public interface HO03060Repository {

	/**
	 * 시스템마감관리 리스트
	 * HO03060_U01
	 * yymm, dept 필요 
	 * @param param
	 * @return
	 */
	List<HO03060> getScmList(Map<String, Object> param);

}
