package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.FindSiteCode;
import com.neofect.gts.services.sm.repository.FindSiteCodeRepository;

/**
 * FindSiteCodeService
 * @author cm
 *
 */
@Service
public class FindSiteCodeService {

	@Autowired
	FindSiteCodeRepository findSiteCodeRepository;

	/**
	 * FindSiteCode
	 * @param param
	 * @return
	 */
	public List<FindSiteCode> FindSiteCode(Map<String, Object> param) {
		return findSiteCodeRepository.FindSiteCode(param);
	}
	
	
}
