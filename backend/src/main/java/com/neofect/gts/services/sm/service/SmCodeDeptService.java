package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmCodeDept;
import com.neofect.gts.services.sm.repository.SmCodeDeptRepository;

/**
 * SmCodeDeptService
 * @author cm
 *
 */
@Service
public class SmCodeDeptService {

	@Autowired
	SmCodeDeptRepository smCodeDeptRepository;
	
	/**
	 * SM_CODE_DEPT_C01 
	 * @param param
	 * @return
	 */
	
	public List<SmCodeDept> SMCODEDEPTC01(Map<String, Object> param) {
		return smCodeDeptRepository.SMCODEDEPTC01(param);
	}
	
}
