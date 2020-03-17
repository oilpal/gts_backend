package com.neofect.gts.services.adjustment.chargeStatus.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.adjustment.chargeStatus.repository.ChargeStatusRepository;
import com.neofect.gts.services.common.domain.Comm;
import com.neofect.gts.services.common.repository.CommRepository;
import com.neofect.gts.services.gs.domain.ChargeStatus;

/**
 * (구)이용계약서 서비스 
 * @author jd
 *
 */
@Service
public class ChargeStatusService {

	@Autowired
	ChargeStatusRepository chargeStatusRepository;

	@Autowired
	CommRepository commRepository;
	
	/**
	 * 고객 청구현황 목록
	 * @param param
	 * @return
	 */
	public List<ChargeStatus> GS01060_R01(Map<String, Object> param) {
		return chargeStatusRepository.GS01060_R01(param);
	}

	/**
	 * 서비스 내역 
	 * @param param
	 * @return
	 */
	public List<ChargeStatus> GS01060_C02(Map<String, Object> param) {
		return chargeStatusRepository.GS01060_C02(param);
	}

	/**
	 * 가산율 추가
	 * @param q
	 * @return
	 */
	public int updateAdditionRate(Map<String, Object> q) {
		return chargeStatusRepository.updateAdditionRate(q);
	}

}
