package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SmCodeTaxoffice;

/**
 * SmCodeTaxofficeRepository
 * @author cm
 *
 */
public interface SmCodeTaxofficeRepository {

	/**
	 * SM_CODE_TAXOFFICE_R01
	 * @param param
	 * @return
	 */
	List<SmCodeTaxoffice> SMCODETAXOFFICER01(Map<String, Object> param);

}
