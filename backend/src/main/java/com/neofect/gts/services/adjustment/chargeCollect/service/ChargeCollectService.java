package com.neofect.gts.services.adjustment.chargeCollect.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.adjustment.chargeCollect.repository.ChargeCollectRepository;
import com.neofect.gts.services.adjustment.chargeStatus.repository.ChargeStatusRepository;
import com.neofect.gts.services.common.domain.Comm;
import com.neofect.gts.services.common.repository.CommRepository;
import com.neofect.gts.services.gs.domain.ChargeCollect;
import com.neofect.gts.services.gs.domain.ChargeStatus;

/**
 * 본인 부담금 수금
 * @author ccm
 *
 */
@Service
public class ChargeCollectService {

	@Autowired
	ChargeCollectRepository chargeCollectRepository;

	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<ChargeCollect> getCARList(Map<String, Object> param) {
		return chargeCollectRepository.getCARList(param);
	}


	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<ChargeCollect> getMSHList(Map<String, Object> param) {
		return chargeCollectRepository.getMSHList(param);
	}


	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<ChargeCollect> getDHList(Map<String, Object> param) {
		return chargeCollectRepository.getDHList(param);
	}


	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<ChargeCollect> getSESList(Map<String, Object> param) {
		return chargeCollectRepository.getSESList(param);
	}


}
