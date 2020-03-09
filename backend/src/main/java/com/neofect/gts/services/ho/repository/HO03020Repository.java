package com.neofect.gts.services.ho.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.ho.domain.HO03020;

/**
 * 센터관리 Repository
 * @author cm
 *
 */
public interface HO03020Repository {

	/**
	 * 센터 관리 리스트
	 * HO03020_C01
	 * * dept, use 필요 
	 * @param param
	 * @return
	 */
	List<HO03020> getCenterList(Map<String, Object> param);

	/**
	 * 계좌 리스트?
	 * HO03020_C03
	 * * dept필요 
	 * @param param
	 * @return
	 */
	List<HO03020> HO03020C03(Map<String, Object> param);

	/**
	 * 센터 권한 사용자 리스트
	 * HO03020_C04
	 * * dept필요 
	 * @param param
	 * @return
	 */
	List<HO03020> HO03020C04(Map<String, Object> param);

}
