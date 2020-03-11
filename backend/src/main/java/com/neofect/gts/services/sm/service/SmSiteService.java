package com.neofect.gts.services.sm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.repository.SmAuthSiteRepository;
import com.neofect.gts.services.sm.repository.SmSiteRepository;

/**
 * SmSiteService
 * @author cm
 *
 */
@Service
public class SmSiteService {

	@Autowired
	SmSiteRepository smSiteRepository;
	
}
