package com.neofect.gts.services.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.repository.FindAddCustCodeRepository;
import com.neofect.gts.services.common.repository.FindAddRqstRepository;
import com.neofect.gts.services.common.repository.FindBankCodeRepository;
import com.neofect.gts.services.common.repository.FindCodeRepository;
import com.neofect.gts.services.common.repository.FindMatrCostRepository;
import com.neofect.gts.services.common.repository.FindMatrCustRepository;
import com.neofect.gts.services.common.repository.FindMatrMasterRepository;
import com.neofect.gts.services.common.repository.FindNewLaborRepository;

/**
 * FindNewLaborService
 * @author jd
 *
 */
@Service
public class FindNewLaborService {

	@Autowired
	FindNewLaborRepository findNewLaborRepository;
	
	
}
