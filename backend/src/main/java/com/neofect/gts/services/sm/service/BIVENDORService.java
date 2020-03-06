package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.BIVENDOR;
import com.neofect.gts.services.sm.repository.BIVENDORRepository;

/**
 * BIVENDORService
 * @author cm
 *
 */
@Service
public class BIVENDORService {

	@Autowired
	BIVENDORRepository biVendorRepository;
	
	/**
	 * BI_VENDOR
	 * @param param
	 * @return
	 */
	
	public List<BIVENDOR> WSM021401(Map<String, Object> param) {
		return biVendorRepository.WSM021401(param);
	}
	
}
