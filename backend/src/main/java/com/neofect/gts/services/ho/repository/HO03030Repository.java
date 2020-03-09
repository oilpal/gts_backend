package com.neofect.gts.services.ho.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.ho.domain.HO03030;

/**
 * 센터데이터복사 Repository
 * @author cm
 *
 */
public interface HO03030Repository {

	/**
	 * HO03030_R01
	 * dept, gubunDiv, workYn 필요 
	 * @param param
	 * @return
	 */
	List<HO03030> getCenterCopyList(Map<String, Object> param);

	/**
	 * HO03030_R03
	 * dept, cust, code, alldate, to, from 필요 
	 * @param param
	 * @return
	 */
	List<HO03030> HO03030R03(Map<String, Object> param);
	
	/**
	 * 요보사 이동 건수
	 * MEMBER_CNT_R01
	 * depttgt, deptsrc 필요
	 * @param param
	 * @return
	 */
	List<HO03030> MEMBERCNTR01(Map<String, Object> param);
	
	/**
	 * 요보사 이동 처리
	 * MEMBER_MOVE
	 * depttgt, deptsrc 필요
	 * @param param
	 * @return
	 */
	List<HO03030> MEMBERMOVE(Map<String, Object> param);
	
	/**
	 * 대상자 이동 건수
	 * CUST_CNT_R01
	 * depttgt, deptsrc 필요
	 * @param param
	 * @return
	 */
	List<HO03030> CUSTCNTR01(Map<String, Object> param);
	
	/**
	 * 대상자 이동 처리
	 * CUST_MOVE
	 * depttgt, deptsrc 필요
	 * @param param
	 * @return
	 */
	List<HO03030> CUSTMOVE(Map<String, Object> param);

}
