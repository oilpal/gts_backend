package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.FindMatrCust;

public interface FindMatrCustRepository {

	List<FindMatrCust> FindMatrCust_01 (Map<String,Object> param);

	List<FindMatrCust> FindMatrCust_02 (Map<String,Object> param);

	List<FindMatrCust> FindMatrCust_03 (Map<String,Object> param);

	List<FindMatrCust> FindMatrCust_S01 (Map<String,Object> param);

	List<FindMatrCust> FindMatrCust_S02 (Map<String,Object> param);

	List<FindMatrCust> FindMatrCust_S03 (Map<String,Object> param);

	List<FindMatrCust> FindMatrCust_S04 (Map<String,Object> param);
	
	List<FindMatrCust> FindMatrCust_S05 (Map<String,Object> param);
	
	List<FindMatrCust> FindMatrCust_S06 (Map<String,Object> param);
	
}
