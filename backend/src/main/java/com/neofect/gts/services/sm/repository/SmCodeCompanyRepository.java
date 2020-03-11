package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmCodeCompany;

/**
 * SmCodeCompanyRepository
 * @author cm
 *
 */
public interface SmCodeCompanyRepository {


	/**
	 * SM010800_C01
	 * cname, group 필요
	 * @param param
	 * @return
	 */ 
	List<SmCodeCompany> SM010800C01(Map<String, Object> param);

	/**
	 * SM010800_dg_1
	 * cname, ccode 필요
	 * @param param
	 * @return
	 */ 
	List<SmCodeCompany> SM010800dg1(Map<String, Object> param);
	
	/**
	 * SM010800_dg_2
	 * cname, ccode 필요
	 * @param param
	 * @return
	 */ 
	List<SmCodeCompany> SM010800dg2(Map<String, Object> param);
	
}
