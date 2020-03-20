package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.FindCustDepositNoVO;

public interface FindCustDepositNoRepository {

	List<FindCustDepositNoVO> FindCustDepositNo (Map<String,Object> param);
	
}
