package com.neofect.gts.services.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.repository.FindAddCustCodeRepository;
import com.neofect.gts.services.common.repository.FindAddRqstRepository;
import com.neofect.gts.services.common.repository.FindBankCodeRepository;
import com.neofect.gts.services.common.repository.FindCodeRepository;
import com.neofect.gts.services.common.repository.FindMatrCost2Repository;
import com.neofect.gts.services.common.repository.FindMatrCostRepository;

/**
 * FindMatrCost2Service
 * @author jd
 *
 */
@Service
public class FindMatrCost2Service {

	@Autowired
	FindMatrCost2Repository findMatrCost2Repository;
	
	
}
