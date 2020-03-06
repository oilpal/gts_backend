package com.neofect.gts.services.gs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS01040;
import com.neofect.gts.services.gs.repository.GS01040Repository;

/**
 * 월별일정/변경(방문) 서비스 
 * @author jd
 *
 */
@Service
public class GS01040Service {

	@Autowired
	GS01040Repository gs01040Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS01040> GS01040_R01(GS01040 gs) {
		return gs01040Repository.GS01040_C01(gs);
	}
}
