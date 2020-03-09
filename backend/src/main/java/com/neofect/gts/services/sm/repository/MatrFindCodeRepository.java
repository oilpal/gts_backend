package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.MatrFindCode;

/**
 * MatrFindCodeRepository
 * @author cm
 *
 */
public interface MatrFindCodeRepository {

	/**
	 * FM_STD_MATR_C01
	 * comp, code 필요
	 * @param param
	 * @return
	 */
	List<MatrFindCode> FMSTDMATRC01(Map<String, Object> param);
	
	/**
	 * FM_STD_MATR_C02 
	 * comp, code, name 필요
	 * @param param
	 * @return
	 */
	List<MatrFindCode> FMSTDMATRC02(Map<String, Object> param);
	
	/**
	 * FM_STD_MATR_S01 
	 * comp, matr 필요
	 * @param param
	 * @return
	 */
	List<MatrFindCode> FMSTDMATRS01(Map<String, Object> param);
	
	/**
	 * FM_STD_MATR_S02 
	 * search, comp, code 필요
	 * @param param
	 * @return
	 */
	List<MatrFindCode> FMSTDMATRS02(Map<String, Object> param);

}
