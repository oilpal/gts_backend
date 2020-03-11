package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmCodeBank;

/**
 * SmCodeBankRepository
 * @author cm
 *
 */
public interface SmCodeBankRepository {


	/**
	 * SM_CODE_BANK_C01
	 * useYn 필요 
	 * @param param
	 * @return
	 */
	List<SmCodeBank> SMCODEBANKC01(Map<String, Object> param);
	
}
