package com.neofect.gts.services.gs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS02040;
import com.neofect.gts.services.gs.repository.GS02040Repository;

/**
 * 요양서비스 일정 조회 
 * @author jd
 *
 */
@Service
public class GS02040Service {

	@Autowired
	GS02040Repository gs02040Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS02040> GS02040_R01(GS02040 gs) {
		return gs02040Repository.GS02040_R01(gs);
	}
}
