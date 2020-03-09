package com.neofect.gts.services.gs.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.gs.domain.GS01010;
import com.neofect.gts.services.gs.repository.GS01010Repository;

/**
 * 대상자 정보관리 서비스 
 * @author jd
 *
 */
@Service
public class GS01010Service {

	@Autowired
	GS01010Repository gs01010Repository;
	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<GS01010> GS01010_C01(GS01010 gs){
		return gs01010Repository.GS01010_C01(gs);
	}
}
