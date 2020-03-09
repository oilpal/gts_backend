package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.XGGRIDCOLSBASE;
import com.neofect.gts.services.sm.repository.XGGRIDCOLSBASERepository;

/**
 * XGGRIDCOLSBASE Service
 * @author cm
 *
 */
@Service
public class XGGRIDCOLSBASEService {

	@Autowired
	XGGRIDCOLSBASERepository xgGridColsBaseRepository;
	
	/**
	 *  
	 * @param param
	 * @return
	 */
	
	public List<XGGRIDCOLSBASE> GRID_COLS_BASE(Map<String, Object> param) {
		return xgGridColsBaseRepository.GRID_COLS_BASE(param);
	}
	
}
