package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmAuthGroup;
import com.neofect.gts.services.sm.repository.SmAuthGroupRepository;

/**
 * SmAuthGroupService
 * @author cm
 *
 */
@Service
public class SmAuthGroupService {

	@Autowired
	SmAuthGroupRepository smAuthGroupRepository;

	/**
	 * C_SM0907_01
	 * @param param
	 * @return
	 */
	public List<SmAuthGroup> CSM090701(Map<String, Object> param) {
		return smAuthGroupRepository.CSM090701(param);
	}
	
	
}
