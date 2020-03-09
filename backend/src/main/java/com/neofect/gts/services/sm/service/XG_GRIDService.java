package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.XG_GRID;
import com.neofect.gts.services.sm.repository.XG_GRIDRepository;

/**
 * XG_GRIDE Service
 * @author cm
 *
 */
@Service
public class XG_GRIDService {

	@Autowired
	XG_GRIDRepository xgGridBaseRepository;
	
	/**
	 *  
	 * @param param
	 * @return
	 */
	
	public List<XG_GRID> GRID_INFO(Map<String, Object> param) {
		return xgGridBaseRepository.GRID_INFO(param);
	}
	
}
