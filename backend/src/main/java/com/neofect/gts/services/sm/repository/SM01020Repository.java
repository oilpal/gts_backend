package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM01020;

/**
 * SM01020Repository
 * @author cm
 *
 */
public interface SM01020Repository {

	/**
	 * SM01020_01
	 * cust 필요
	 * @param param
	 * @return
	 */   
	List<SM01020> SM0102001(Map<String, Object> param);

	
}
