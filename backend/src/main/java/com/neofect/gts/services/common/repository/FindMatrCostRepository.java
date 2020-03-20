package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.FindMatrCost;


public interface FindMatrCostRepository {

	List<FindMatrCost> FindMatrCost_01 (Map<String,Object> param);

	List<FindMatrCost> FindMatrCost_01_old (Map<String,Object> param);
	
}
