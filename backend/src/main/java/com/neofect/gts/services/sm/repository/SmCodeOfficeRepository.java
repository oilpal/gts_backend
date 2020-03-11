package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmCodeOffice;

/**
 * SmCodeIfinfoRepository
 * @author cm
 *
 */
public interface SmCodeOfficeRepository {

	/**
	 * SM_CODE_OFFICE_C01
	 * companyuCode 필요
	 * @param param
	 * @return
	 */
	List<SmCodeOffice> SMCODEOFFICEC01(Map<String, Object> param);
	
	/**
	 * SM010900_dg1
	 * companyuCode 필요
	 * @param param
	 * @return
	 */
	List<SmCodeOffice> SM010900dg1(Map<String, Object> param);

}
