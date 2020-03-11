package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmCodeDept;

/**
 * SmCodeDeptRepository
 * @author cm
 *
 */
public interface SmCodeDeptRepository {


	/**
	 * SM010800_C01
	 * compcode, deptcode, deptname, useyn 필요
	 * @param param
	 * @return
	 */ 
	List<SmCodeDept> SMCODEDEPTC01(Map<String, Object> param);
	
	/**
	 * SM011300_dg1
	 * compcode, deptcode, deptname, useyn 필요
	 * @param param
	 * @return
	 */ 
	List<SmCodeDept> SM011300dg1(Map<String, Object> param);
	
}
