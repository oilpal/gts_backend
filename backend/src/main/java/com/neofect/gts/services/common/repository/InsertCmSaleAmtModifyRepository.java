package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.InsertCmSaleAmtModify;


public interface InsertCmSaleAmtModifyRepository {
	
	/* 상단 프리폼용 쿼리 */
	List<InsertCmSaleAmtModify> R_InsertCmSaleAmtModify_FREE (Map<String,Object> param);

	/* 하단 그리드 쿼리 */
	List<InsertCmSaleAmtModify> R_InsertCmSaleAmtModify_01 (Map<String,Object> param);

	List<InsertCmSaleAmtModify> R_InsertCmSaleAmtModify_02 (Map<String,Object> param);

	
}
