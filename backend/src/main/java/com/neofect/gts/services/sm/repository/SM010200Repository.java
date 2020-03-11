package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM010200;

public interface SM010200Repository {

	List<SM010200> R_SM010200_01(Map<String, Object> param);

	List<SM010200> R_SM010200_02(Map<String, Object> param);
	
	List<SM010200> R_SM010200_DEPT_CODE_MAX(Map<String, Object> param);

}
