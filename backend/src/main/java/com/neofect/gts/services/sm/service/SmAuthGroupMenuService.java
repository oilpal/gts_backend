package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.SmAuthGroupMenu;
import com.neofect.gts.services.sm.repository.SmAuthGroupMenuRepository;

/**
 * SmAuthGroupMenuService
 * @author cm
 *
 */
@Service
public class SmAuthGroupMenuService {

	@Autowired
	SmAuthGroupMenuRepository smAuthGroupMenuRepository;

	/**
	 * C_SM0907_01
	 * @param param
	 * @return
	 */
	public List<SmAuthGroupMenu> CSM090701(Map<String, Object> param) {
		return smAuthGroupMenuRepository.CSM090701(param);
	}
	
	
}
