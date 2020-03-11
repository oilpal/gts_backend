package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmAuthSite;
import com.neofect.gts.services.sm.domain.SmCodeBank;
import com.neofect.gts.services.sm.repository.SmAuthSiteRepository;
import com.neofect.gts.services.sm.repository.SmCodeBankRepository;

/**
 * SmCodeBankService
 * @author cm
 *
 */
@Service
public class SmCodeBankService {

	@Autowired
	SmCodeBankRepository smCodeBankRepository;

	/**
	 * SM_CODE_BANK_C01
	 * @param param
	 * @return
	 */
	public List<SmCodeBank> SMCODEBANKC01(Map<String, Object> param) {
		return smCodeBankRepository.SMCODEBANKC01(param);
	}
	
	
}
