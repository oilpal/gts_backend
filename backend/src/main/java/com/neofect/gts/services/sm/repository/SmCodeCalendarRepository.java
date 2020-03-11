package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmCodeCalendar;

/**
 * SmCodeCalendarRepository
 * @author cm
 *
 */
public interface SmCodeCalendarRepository {

	/**
	 * SM_CODE_HOLYBASE_C01
	 * @param param
	 * @return
	 */
	List<SmCodeCalendar> SMCODEHOLYBASEC01(Map<String, Object> param);
	
	/**
	 * SM_CODE_HOLYDATE_C01
	 * comp, year 필요
	 * @param param
	 * @return
	 */
	List<SmCodeCalendar> SMCODEHOLYDATEC01(Map<String, Object> param);

}
