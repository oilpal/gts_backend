package com.neofect.gts.services.account.info.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.account.info.domain.AccountInfo;
import com.neofect.gts.services.account.info.repository.AccountInfoRepository;

/**
 * 대상자 정보관리 서비스 
 * @author jd
 *
 */
@Service
public class AccountInfoService {

	@Autowired
	AccountInfoRepository accountInfoRepository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<AccountInfo> GS01010_C01(Map<String, Object> gs){
		return accountInfoRepository.GS01010_C01(gs);
	}
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<AccountInfo> GS01010_U02(Map<String, Object> gs){
		return accountInfoRepository.GS01010_U02(gs);
	}
}
