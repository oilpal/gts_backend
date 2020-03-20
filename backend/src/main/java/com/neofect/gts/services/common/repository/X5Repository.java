package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.X5;

public interface X5Repository {

	/* 공통코드 */
	List<X5> GRID (Map<String,Object> param);

	/* 공통코드 */
	List<X5> GRID_SCRIPT (Map<String,Object> param);

	/* 공통코드 */
	List<X5> GRID_COLS (Map<String,Object> param);
	
}
