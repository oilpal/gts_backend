package com.neofect.gts.services.gs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS01080;
import com.neofect.gts.services.gs.repository.GS01080Repository;

/**
 * 고객별 서비스 이용내역 서비스 
 * @author jd
 *
 */
@Service
public class GS01080Service {

	@Autowired
	GS01080Repository gs01080Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS01080> GS01080_R01(GS01080 gs) {
		return gs01080Repository.GS01080_R01(gs);
	}
}
