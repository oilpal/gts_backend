package com.neofect.gts.services.gs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS01060;
import com.neofect.gts.services.gs.repository.GS01060Repository;

/**
 * (구)이용계약서 서비스 
 * @author jd
 *
 */
@Service
public class GS01060Service {

	@Autowired
	GS01060Repository gs01060Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS01060> GS01060_R01(GS01060 gs) {
		return gs01060Repository.GS01060_R01(gs);
	}
}
