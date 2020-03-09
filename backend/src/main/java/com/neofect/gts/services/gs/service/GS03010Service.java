package com.neofect.gts.services.gs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS03010;
import com.neofect.gts.services.gs.repository.GS03010Repository;

/**
 * 월별손익계산서 
 * @author jd
 *
 */
@Service
public class GS03010Service {

	@Autowired
	GS03010Repository gs03010Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS03010> GS03010_R01(GS03010 gs) {
		return gs03010Repository.GS03010_R01(gs);
	}
}
