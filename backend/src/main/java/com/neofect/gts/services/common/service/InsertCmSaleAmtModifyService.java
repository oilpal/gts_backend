package com.neofect.gts.services.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.repository.FindAddCustCodeRepository;
import com.neofect.gts.services.common.repository.FindAddRqstRepository;
import com.neofect.gts.services.common.repository.FindBankCodeRepository;
import com.neofect.gts.services.common.repository.FindCodeRepository;
import com.neofect.gts.services.common.repository.FindSapCode2Repository;
import com.neofect.gts.services.common.repository.FindSapCode3Repository;
import com.neofect.gts.services.common.repository.FindSapCodeRepository;
import com.neofect.gts.services.common.repository.InsertCmSaleAmtModifyRepository;

/**
 * InsertCmSaleAmtModifyService
 * @author jd
 *
 */
@Service
public class InsertCmSaleAmtModifyService {

	@Autowired
	InsertCmSaleAmtModifyRepository insertCmSaleAmtModifyRepository;
	
	
}
