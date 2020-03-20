package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.SelectDept;

public interface SelectDeptRepository {

	/* 거래처찾기 */
	List<SelectDept> FIND_CODE_DEPT (Map<String,Object> param);
	
}
