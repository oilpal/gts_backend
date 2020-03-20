package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.FindMatrMaster;


public interface FindMatrMasterRepository {

	List<FindMatrMaster> FindMatrMaster_01_old (Map<String,Object> param);

	List<FindMatrMaster> FindMatrMaster_01 (Map<String,Object> param);
	
}
