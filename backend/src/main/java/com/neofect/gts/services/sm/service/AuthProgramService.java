package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.AuthMenu;
import com.neofect.gts.services.sm.domain.AuthProgram;
import com.neofect.gts.services.sm.repository.AuthMenuRepository;
import com.neofect.gts.services.sm.repository.AuthProgramRepository;

/**
 * AuthProgramService
 * @author cm
 *
 */
@Service
public class AuthProgramService {

	@Autowired
	AuthProgramRepository authProgramRepository;
	
	/**
	 * HEAD_MENU
	 * @param param
	 * @return
	 */
	
	public List<AuthProgram> AuthProgramE01(Map<String, Object> param) {
		return authProgramRepository.AuthProgramE01(param);
	}
	
}
