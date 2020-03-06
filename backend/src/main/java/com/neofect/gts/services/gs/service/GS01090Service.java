package com.neofect.gts.services.gs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS01090;
import com.neofect.gts.services.gs.repository.GS01090Repository;

/**
 * 대상자 주별일정/변경 
 * @author jd
 *
 */
@Service
public class GS01090Service {

	@Autowired
	GS01090Repository gs01090Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS01090> GS01090_C01(GS01090 gs) {
		return gs01090Repository.GS01090_C01(gs);
	}
}
