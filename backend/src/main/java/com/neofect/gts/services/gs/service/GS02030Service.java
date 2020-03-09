package com.neofect.gts.services.gs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS02030;
import com.neofect.gts.services.gs.repository.GS02030Repository;

/**
 * 요양보호사별 서비스 일정 조회 
 * @author jd
 *
 */
@Service
public class GS02030Service {

	@Autowired
	GS02030Repository gs02030Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS02030> GS02030_R01(GS02030 gs) {
		return gs02030Repository.GS02030_R01(gs);
	}
}
