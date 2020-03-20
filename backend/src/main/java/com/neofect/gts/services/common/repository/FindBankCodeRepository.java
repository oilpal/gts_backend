package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.FindBankCodeVO;

public interface FindBankCodeRepository {

	List<FindBankCodeVO> FindBankCode (Map<String,Object> param);
	
	
	
}
