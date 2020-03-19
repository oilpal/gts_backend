package com.neofect.gts.services.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.repository.FindAddCustCodeRepository;
import com.neofect.gts.services.common.repository.FindAddRqstRepository;
import com.neofect.gts.services.common.repository.FindBankCodeRepository;
import com.neofect.gts.services.common.repository.FindBoardRepository;
import com.neofect.gts.services.common.repository.FindCustDepositNoRepository;

/**
 * FindCustDepositNoService
 * @author ccm
 *
 */
@Service
public class FindCustDepositNoService {

	@Autowired
	FindCustDepositNoRepository findCustDepositNoRepository;
	
	
}
