package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmAuthSite;
import com.neofect.gts.services.sm.domain.SmCodeBank;
import com.neofect.gts.services.sm.domain.SmCodeCompany;
import com.neofect.gts.services.sm.repository.SmAuthSiteRepository;
import com.neofect.gts.services.sm.repository.SmCodeBankRepository;
import com.neofect.gts.services.sm.repository.SmCodeCompanyRepository;

/**
 * SmCodeCompanyService
 * @author cm
 *
 */
@Service
public class SmCodeCompanyService {

	@Autowired
	SmCodeCompanyRepository smCodeCompanyRepository;

	/**
	 * SM010800_C01
	 * @param param
	 * @return
	 */
	public List<SmCodeCompany> SM010800C01(Map<String, Object> param) {
		return smCodeCompanyRepository.SM010800C01(param);
	}
	
	
}
