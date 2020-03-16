package com.neofect.gts.services.common.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.domain.Code;
import com.neofect.gts.services.common.repository.CodeRepository;
import com.neofect.gts.services.common.repository.CommRepository;

/**
 * 공통 서비스 
 * @author jd
 *
 */
@Service
public class CommService {

	@Autowired
	CommRepository commRepository;
	
	
}
