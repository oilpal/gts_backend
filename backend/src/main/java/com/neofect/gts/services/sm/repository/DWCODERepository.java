package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.DWCODE;

/**
 * DWCODERepository
 * @author cm
 *
 */
public interface DWCODERepository {

	/**
	 * DW_CODE_C01
	 * @param param
	 * @return
	 */
	List<DWCODE> DWCODEC01(Map<String, Object> param);
	
	/**
	 * DW_CODE_C02
	 * @param param
	 * @return
	 */
	List<DWCODE> DWCODEC02(Map<String, Object> param);

}
