package com.neofect.gts.services.gs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS01030;
import com.neofect.gts.services.gs.repository.GS01030Repository;

/**
 * (구)이용계약서 서비스 
 * @author jd
 *
 */
@Service
public class GS01030Service {

	@Autowired
	GS01030Repository gs01030Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS01030> GS01020_R01(GS01030 gs) {
		return gs01030Repository.GS01030_C01(gs);
	}
}
