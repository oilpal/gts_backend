package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.FindAddCustCode;

public interface FindAddCustCodeRepository {

	List<FindAddCustCode> FindAddCustCode_01(Map<String,Object> param);

	List<FindAddCustCode> CHK_EXIST_CUST(Map<String,Object> param);
	
	List<FindAddCustCode> R_IM01010_03(Map<String, Object> param);
	
	List<FindAddCustCode> R_IM01010_04(Map<String, Object> param);
	
	List<FindAddCustCode> R_IM01010_05(Map<String, Object> param);
	
	List<FindAddCustCode> R_NEWCUST_INSERT(Map<String, Object> param);
	
}
