package com.neofect.gts.services.gs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS01050;
import com.neofect.gts.services.gs.repository.GS01050Repository;

/**
 * 월별일정/변경(방문) 서비스 
 * @author jd
 *
 */
@Service
public class GS01050Service {

	@Autowired
	GS01050Repository gs01050Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS01050> GS01040_R01(GS01050 gs) {
		return gs01050Repository.GS01050_C01(gs);
	}
}
