package com.neofect.gts.services.adjustment.chargeCollect.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.adjustment.chargeCollect.domain.AdjustmentChargeCollect;
import com.neofect.gts.services.adjustment.chargeCollect.repository.AdjustmentChargeCollectRepository;
import com.neofect.gts.services.adjustment.chargeStatus.repository.AdjustmentChargeStatusRepository;
import com.neofect.gts.services.common.domain.Comm;
import com.neofect.gts.services.common.repository.CommRepository;

/**
 * 본인 부담금 수금
 * @author ccm
 *
 */
@Service
public class AdjustmentChargeCollectService {

	@Autowired
	AdjustmentChargeCollectRepository chargeCollectRepository;

	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<AdjustmentChargeCollect> getCARList(Map<String, Object> param) {
		return chargeCollectRepository.getCARList(param);
	}


	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<AdjustmentChargeCollect> getMSHList(Map<String, Object> param) {
		return chargeCollectRepository.getMSHList(param);
	}


	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<AdjustmentChargeCollect> getDHList(Map<String, Object> param) {
		return chargeCollectRepository.getDHList(param);
	}


	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<AdjustmentChargeCollect> getSESList(Map<String, Object> param) {
		return chargeCollectRepository.getSESList(param);
	}


}
