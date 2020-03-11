package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmCodeOffice;
import com.neofect.gts.services.sm.repository.SmCodeOfficeRepository;

/**
 * SmCodeOfficeService
 * @author cm
 *
 */
@Service
public class SmCodeOfficeService {

	@Autowired
	SmCodeOfficeRepository smCodeOfficeRepository;

	/**
	 * SM_CODE_OFFICE_C01
	 * @param param
	 * @return
	 */
	public List<SmCodeOffice> SMCODEOFFICEC01(Map<String, Object> param) {
		return smCodeOfficeRepository.SMCODEOFFICEC01(param);
	}
	
	
}
