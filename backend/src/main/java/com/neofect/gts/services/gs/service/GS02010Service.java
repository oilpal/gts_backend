package com.neofect.gts.services.gs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS02010;
import com.neofect.gts.services.gs.repository.GS02010Repository;

/**
 * 대상자 주별일정/변경 
 * @author jd
 *
 */
@Service
public class GS02010Service {

	@Autowired
	GS02010Repository gs02010Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS02010> GS02010_C01(GS02010 gs) {
		return gs02010Repository.GS02010_C01( gs);
	}
}
