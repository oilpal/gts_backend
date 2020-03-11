package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmCodeTaxoffice;
import com.neofect.gts.services.sm.domain.SmComCodeD;
import com.neofect.gts.services.sm.repository.SmCodeTaxofficeRepository;
import com.neofect.gts.services.sm.repository.SmComCodeDRepository;

/**
 * SmComCodeDService
 * @author cm
 *
 */
@Service
public class SmComCodeDService {

	@Autowired
	SmComCodeDRepository smComCodeDRepository;

	/**
	 * SM011900_dg_1
	 * @param param
	 * @return
	 */
	public List<SmComCodeD> SM011900dg1(Map<String, Object> param) {
		return smComCodeDRepository.SM011900dg1(param);
	}
	
	
}
