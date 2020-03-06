package com.neofect.gts.services.gs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS02020;
import com.neofect.gts.services.gs.repository.GS02020Repository;

/**
 * 급여관리 
 * @author jd
 *
 */
@Service
public class GS02020Service {

	@Autowired
	GS02020Repository gs02020Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS02020> GS02020_C01(GS02020 gs) {
		return gs02020Repository.GS02020_C01( gs);
	}
}
