package com.neofect.gts.services.gs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS01070;
import com.neofect.gts.services.gs.repository.GS01070Repository;

/**
 * 고객별 서비스 이용내역 서비스 
 * @author jd
 *
 */
@Service
public class GS01070Service {

	@Autowired
	GS01070Repository gs01070Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS01070> GS01070_R01(GS01070 gs) {
		return gs01070Repository.GS01070_R01(gs);
	}
}
