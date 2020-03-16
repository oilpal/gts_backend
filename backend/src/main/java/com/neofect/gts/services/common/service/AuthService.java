package com.neofect.gts.services.common.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.common.domain.Code;
import com.neofect.gts.services.common.repository.AuthRepository;
import com.neofect.gts.services.common.repository.CodeRepository;
import com.neofect.gts.services.common.repository.CommRepository;

/**
 * AuthService
 * @author ccm
 *
 */
@Service
public class AuthService {

	@Autowired
	AuthRepository authRepository;
	
	
}
