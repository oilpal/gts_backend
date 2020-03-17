package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmCommon;

/**
 * SmCommonRepository
 * @author cm
 *
 */
public interface SmCommonRepository {

	/**
	 * SM_COMCODE_D
	 * hcode, sysId 필요
	 * @param param
	 * @return
	 */
	List<SmCommon> SMCOMCODED(Map<String, Object> param);

	/**
	 * SM_COMCODE_D_EM
	 * hcode, sysId, relCode 필요
	 * @param param
	 * @return
	 */
	List<SmCommon> SMCOMCODEDEM(Map<String, Object> param);
	
	/**
	 * S_SM0709_01
	 * 프로그램 사용여부 조회 (년도)
	 * comp, user, date, site 필요
	 * @param param
	 * @return
	 */
	List<SmCommon> SSM070901(Map<String, Object> param);
	
	/**
	 * S_SM0709_02
	 * 프로그램 사용여부 조회 (월)
	 * comp, user, date, site 필요
	 * @param param
	 * @return
	 */
	List<SmCommon> SSM070902(Map<String, Object> param);
	
	/**
	 * C_SM0708_01
	 * TEXTAREA 변환
	 * comp, user, date, site 필요
	 * @param param
	 * @return
	 */
	List<SmCommon> CSM070801(Map<String, Object> param);
	
	/**
	 * S_SM0709_03
	 * date필요
	 * @param param
	 * @return
	 */
	List<SmCommon> SSM070903(Map<String, Object> param);
	
	/**
	 * S_SM0709_04
	 * 일별 집계
	 * comp, user, date, site 필요
	 * @param param
	 * @return
	 */
	List<SmCommon> SSM070904(Map<String, Object> param);
	
	/**
	 * S_SM0709_05
	 * 월별 집계
	 * comp, user, date, site 필요
	 * @param param
	 * @return
	 */
	List<SmCommon> SSM070905(Map<String, Object> param);

	/**
	 * S_SM0706_01
	 * NFC 매핑 수 조회 -> 전체 COUNT
	 * @param param
	 * @return
	 */
	List<SmCommon> SSM070601(Map<String, Object> param);
	
	/**
	 * S_SM0706_02
	 * NFC 매핑 수 조회 -> 설비 매핑 수
	 * @param param
	 * @return
	 */
	List<SmCommon> SSM070602(Map<String, Object> param);
	
	/**
	 * S_SM0706_03
	 * NFC 매핑 수 조회 -> 장비 매핑 수
	 * @param param
	 * @return
	 */
	List<SmCommon> SSM070603(Map<String, Object> param);
	
	/**
	 * S_SM0706_04
	 * NFC 매핑 수 조회 -> 검침기 매핑 수
	 * @param param
	 * @return
	 */
	List<SmCommon> SSM070604(Map<String, Object> param);
	
	/**
	 * S_SM0706_05
	 * NFC 매핑 수 조회 -> 점검위치 매핑 수
	 * @param param
	 * @return
	 */
	List<SmCommon> SSM070605(Map<String, Object> param);
	
	/**
	 * GET_CLOSE_CONFIG
	 * 마감일 설정
	 * @param param
	 * @return
	 */
	List<SmCommon> GETCLOSECONFIG(Map<String, Object> param);

}
