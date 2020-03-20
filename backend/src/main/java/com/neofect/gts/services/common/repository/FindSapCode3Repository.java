package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.FindSapCode3;


public interface FindSapCode3Repository {

	List<FindSapCode3> FindSapCode (Map<String,Object> param);
	
}
