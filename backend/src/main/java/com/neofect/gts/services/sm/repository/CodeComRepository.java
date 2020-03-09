package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.CodeCom;

/**
 * CodeComRepository
 * @author cm
 *
 */
public interface CodeComRepository {

	/**
	 * CODE_COMC_D01
	 * fieldValue 필요
	 * @param param
	 * @return
	 */
	List<CodeCom> CODECOMCD01(Map<String, Object> param);

	/**
	 * CODE_COMC_D02
	 * fieldValue, commRef1, commRef2, commRef3 필요
	 * @param param
	 * @return
	 */
	List<CodeCom> CODECOMCD02(Map<String, Object> param);

	/**
	 * SM_AUTH_SYS_R01
	 * @param param
	 * @return
	 */
	List<CodeCom> SMAUTHSYSR01(Map<String, Object> param);

}
