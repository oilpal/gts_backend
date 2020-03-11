package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM01140;

public interface SM01140Repository {

	List<SM01140> SM01140_01(Map<String, Object> param);

	List<SM01140> SM01140_02(Map<String, Object> param);
	
	List<SM01140> R_SM01140_01(Map<String, Object> param);

}
