package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.XGGRIDCOLSBASE;

/**
 * XGGRIDCOLSBASE Repository
 * @author cm
 *
 */
public interface XGGRIDCOLSBASERepository {

	/**
	 * 
	 * @param param
	 * @return
	 */
	List<XGGRIDCOLSBASE> GRID_COLS_BASE(Map<String, Object> param);

}
