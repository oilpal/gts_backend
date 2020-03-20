package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.SelectEmp;

public interface SelectEmpRepository {

	/* 사원찾기 */
	List<SelectEmp> FIND_MEMBER (Map<String,Object> param);
	
}
