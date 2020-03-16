package com.neofect.gts.services.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.repository.FindAddCustCodeRepository;

/**
 * FindAddCustCodeService
 * @author jd
 *
 */
@Service
public class FindAddCustCodeService {

	@Autowired
	FindAddCustCodeRepository findAddCustCodeRepository;
	
	
}
