package com.neofect.gts.services.gs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS01020;
import com.neofect.gts.services.gs.repository.GS01020Repository;

/**
 * 서비스 계약관리 서비스 
 * @author jd
 *
 */
@Service
public class GS01020Service {

	@Autowired
	GS01020Repository gs01020Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS01020> GS01020_R01(GS01020 gs) {
		return gs01020Repository.GS01020_R01(gs);
	}
}
