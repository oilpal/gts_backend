package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM01050;

public interface SM01050Repository {

	List<SM01050> SM01050R01(Map<String, Object> param);

	List<SM01050> RSM01050DEPTCODEMAX(Map<String, Object> param);

}
