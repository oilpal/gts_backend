package com.neofect.gts.services.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.repository.FindAddCustCodeRepository;
import com.neofect.gts.services.common.repository.FindAddRqstRepository;
import com.neofect.gts.services.common.repository.FindBankCodeRepository;
import com.neofect.gts.services.common.repository.FindCodeRepository;
import com.neofect.gts.services.common.repository.FindMatrCostRepository;
import com.neofect.gts.services.common.repository.FindMatrCustRepository;
import com.neofect.gts.services.common.repository.FindPmRepository;
import com.neofect.gts.services.common.repository.FindPspRepository;
import com.neofect.gts.services.common.repository.X5Repository;

/**
 * X5Service
 * @author jd
 *
 */
@Service
public class X5Service {

	@Autowired
	X5Repository x5Repository;
	
	
}
