package com.neofect.gts.services.sm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.sm.domain.MatrFindCode;
import com.neofect.gts.services.sm.repository.MatrFindCodeRepository;

/**
 * MatrFindCodeService
 * @author cm
 *
 */
@Service
public class MatrFindCodeService {

	@Autowired
	MatrFindCodeRepository martFindCodeRepository;

	/**
	 * FM_STD_MATR_C01
	 * @param param
	 * @return
	 */
	public List<MatrFindCode> FMSTDMATRC01(Map<String, Object> param) {
		return martFindCodeRepository.FMSTDMATRC01(param);
	}
	
	
}
