package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.repository.CodeRepository;
import com.neofect.gts.services.sm.domain.CMAREACDT;
import com.neofect.gts.services.sm.domain.CMMAGAMJECDT;
import com.neofect.gts.services.sm.domain.CMORGSTANDARDT;
import com.neofect.gts.services.sm.domain.CodeCom;
import com.neofect.gts.services.sm.domain.DWCODE;
import com.neofect.gts.services.sm.domain.EMCO2;
import com.neofect.gts.services.sm.domain.FindCustCode;
import com.neofect.gts.services.sm.repository.CMAREACDTRepository;
import com.neofect.gts.services.sm.repository.CMMAGAMJECDTRepository;
import com.neofect.gts.services.sm.repository.CMORGSTANDARDTRepository;
import com.neofect.gts.services.sm.repository.CodeComRepository;
import com.neofect.gts.services.sm.repository.DWCODERepository;
import com.neofect.gts.services.sm.repository.EMCO2Repository;
import com.neofect.gts.services.sm.repository.FindCustCodeRepository;

/**
 * FindCustCodeService
 * @author cm
 *
 */
@Service
public class FindCustCodeService {

	@Autowired
	FindCustCodeRepository findCustCodeRepository;

	/**
	 * FindCustCode
	 * @param param
	 * @return
	 */
	public List<FindCustCode> FindCustCode(Map<String, Object> param) {
		return findCustCodeRepository.FindCustCode(param);
	}
	
	
}
