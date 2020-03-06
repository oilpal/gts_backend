package com.neofect.gts.services.ho.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.ho.domain.HO02020;

/**
 * 간이 세액 조견표 Repository
 * @author cm
 *
 */
public interface HO02020Repository {

	/**
	 * 간이 세액 조견표
	 * HO02020_U01
	 * @param param
	 * @return
	 */
	List<HO02020> getSimpleTaxList(Map<String, Object> param);

}
