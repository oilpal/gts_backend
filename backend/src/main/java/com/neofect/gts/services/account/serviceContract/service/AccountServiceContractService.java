package com.neofect.gts.services.account.serviceContract.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.account.serviceContract.domain.AccountServiceContract;
import com.neofect.gts.services.account.serviceContract.repository.AccountServiceContractRepository;

/**
 * 서비스 계약관리 서비스 
 * @author jd
 *
 */
@Service
public class AccountServiceContractService {

	@Autowired
	AccountServiceContractRepository accountServiceContractRepository;
	
	/**
	 * 대상자 검색
	 * @param param
	 * @return
	 */
	public List<AccountServiceContract> GS01020_R01(Map<String, Object> gs) {
		return accountServiceContractRepository.GS01020_R01(gs);
	}
	
	/**
	 * 계약 히스토리 검색
	 * @param param
	 * @return
	 */
	public List<AccountServiceContract> GS01020_C02(Map<String, Object> gs) {
		return accountServiceContractRepository.GS01020_C02(gs);
	}
}
