package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.FindSapCode;


public interface FindSapCodeRepository {

	List<FindSapCode> FindSapCode (Map<String,Object> param);
	
}
