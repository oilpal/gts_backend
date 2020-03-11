package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmCodeTaxoffice;
import com.neofect.gts.services.sm.repository.SmCodeTaxofficeRepository;

/**
 * SmCodeTaxofficeService
 * @author cm
 *
 */
@Service
public class SmCodeTaxofficeService {

	@Autowired
	SmCodeTaxofficeRepository smCodeTaxofficeRepository;

	/**
	 * SM_CODE_OFFICE_C01
	 * @param param
	 * @return
	 */
	public List<SmCodeTaxoffice> SMCODETAXOFFICER01(Map<String, Object> param) {
		return smCodeTaxofficeRepository.SMCODETAXOFFICER01(param);
	}
	
	
}
