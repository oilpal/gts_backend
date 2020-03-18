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
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public int DEL_CODE_CUSTINDEPT(Map<String, Object> gs){
		return accountInfoRepository.DEL_CODE_CUSTINDEPT(gs);
	}
	
	/**
	 * 중복확인 
	 * @param param
	 * @return
	 */
	public List<AccountInfo> CHK_CODE_CUST(Map<String, Object> gs){
		return accountInfoRepository.CHK_CODE_CUST(gs);
	}
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<AccountInfo> CODE_CUST_R01(Map<String, Object> gs){
		return accountInfoRepository.CODE_CUST_R01(gs);
	}
}
