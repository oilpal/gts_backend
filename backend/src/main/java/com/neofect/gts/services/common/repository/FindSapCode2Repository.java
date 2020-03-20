package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.FindSapCode2;


public interface FindSapCode2Repository {

	List<FindSapCode2> FindSapCode (Map<String,Object> param);
	
}
