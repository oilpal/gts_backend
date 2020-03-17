package com.neofect.gts.services.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.repository.FindAddCustCodeRepository;
import com.neofect.gts.services.common.repository.FindAddRqstRepository;

/**
 * FindAddRqstService
 * @author jd
 *
 */
@Service
public class FindAddRqstService {

	@Autowired
	FindAddRqstRepository findAddRqstRepository;
	
	
}
