package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.FindPsp;

public interface FindPspRepository {

	List<FindPsp> FindPsp_01 (Map<String,Object> param);
	
}
