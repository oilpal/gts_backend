package com.neofect.gts.services.common.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.domain.GsCommon;
import com.neofect.gts.services.common.repository.GsCommonRepository;

/**
 * GS_COMMON 서비스 
 * @author jd
 *
 */
@Service
public class GsCommonService {

	@Autowired
	GsCommonRepository gs_commonRepository;
	
	/**
	 * 최근 계약번호 가져오기
	 * @param gs
	 * @return
	 */
	public int GET_MAX_CONTSEQ(Map<String, Object> gs) {
		return gs_commonRepository.GET_MAX_CONTSEQ(gs);
	}

	/**
	 * 고객 지사별 비고 수정
	 * @param gs
	 * @return
	 */
	public int CODE_CUSTINDEPT_U01(Map<String, Object> gs) {
		return gs_commonRepository.CODE_CUSTINDEPT_U01(gs);
	}

	/**
	 * 고객 지사별 비고
	 * @param gs
	 * @return
	 */
	public String CODE_CUSTINDEPT_R01(Map<String, Object> gs) {
		return gs_commonRepository.CODE_CUSTINDEPT_R01(gs);
	}

	/**
	 * 다음 순번의 고객ID를 반환
	 * @param gs
	 * @return
	 */
	public int NEXT_CUST_ID(Map<String, Object> gs) {
		return gs_commonRepository.NEXT_CUST_ID(gs);
	}

	/**
	 * 재가요양서비스 월 한도금액 가져오기 ( 등급 입력용 )
	 * @param gs
	 * @return
	 */
	public GsCommon GET_CARE_BASIC_AMT(Map<String, Object> gs) {
		return gs_commonRepository.GET_CARE_BASIC_AMT(gs);
	}

	/**
	 * 각종 마감 체크
	 * @param gs
	 * @return
	 */
	public int CHK_CLOSING(Map<String, Object> gs) {
		return gs_commonRepository.CHK_CLOSING(gs);
	}

	/**
	 * 각종 마감 처리
	 * @param gs
	 * @return
	 */
	public int CODE_CLOSING_U01(Map<String, Object> gs) {
		return gs_commonRepository.CODE_CLOSING_U01(gs);
	}

	/**
	 * 서비스 product_id 가져오기
	 * @param gs
	 * @return
	 */
	public String GET_PRODUCT_ID(Map<String, Object> gs) {
		return gs_commonRepository.GET_PRODUCT_ID(gs);
	}

	/**
	 * 다음 순번의 서비스ID를 반환
	 * @param gs
	 * @return
	 */
	public String GET_SEQ_S_ID(Map<String, Object> gs) {
		return gs_commonRepository.GET_SEQ_S_ID(gs);
	}

	/**
	 * SetRemainAmtCalc 사용
	 * @param gs
	 * @return
	 */
	public List<GsCommon> SetRemainAmtCalc_R01(Map<String, Object> gs) {
		return gs_commonRepository.SetRemainAmtCalc_R01(gs);
	}

	/**
	 * 
	 * @param gs
	 * @return
	 */
	public List<GsCommon> SetRemainAmtCalc_R02(Map<String, Object> gs) {
		return gs_commonRepository.SetRemainAmtCalc_R02(gs);
	}

	/**
	 * 
	 * @param gs
	 * @return
	 */
	public List<GsCommon> SetRemainAmtCalc_R03(Map<String, Object> gs) {
		return gs_commonRepository.SetRemainAmtCalc_R03(gs);
	}
}
