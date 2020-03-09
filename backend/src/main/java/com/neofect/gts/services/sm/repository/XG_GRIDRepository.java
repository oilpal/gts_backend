package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.XG_GRID;

/**
 * XG_GRID Repository
 * @author cm
 *
 */
public interface XG_GRIDRepository {

	/**
	 * 
	 * @param param
	 * @return
	 */
	List<XG_GRID> GRID_INFO(Map<String, Object> param);

	/**
	 *   
	 * @param param
	 * @return
	 */
	List<XG_GRID> GRID_COLS(Map<String, Object> param);
	
	/**
	 *   
	 * @param param
	 * @return
	 */
	int PARAM_NUM();

}
