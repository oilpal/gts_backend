package com.neofect.gts.services.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.repository.CommonRepository;

/**
 * CommonService
 * @author ccm
 *
 */
@Service
public class CommonService {

	@Autowired
	CommonRepository commonRepository;
	
	
}
