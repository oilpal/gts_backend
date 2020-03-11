package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmCodeCalendar;
import com.neofect.gts.services.sm.repository.SmCodeCalendarRepository;

/**
 * SmCodeCalendarService
 * @author cm
 *
 */
@Service
public class SmCodeCalendarService {

	@Autowired
	SmCodeCalendarRepository smCodeCalendarRepository;
	
	/**
	 * SM_CODE_HOLYBASE_C01 
	 * @param param
	 * @return
	 */
	
	public List<SmCodeCalendar> SMCODEHOLYBASEC01(Map<String, Object> param) {
		return smCodeCalendarRepository.SMCODEHOLYBASEC01(param);
	}
	
}
