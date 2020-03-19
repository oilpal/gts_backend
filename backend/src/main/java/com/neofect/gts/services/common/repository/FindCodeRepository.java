package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.FindCode;


public interface FindCodeRepository {

	List<FindCode> FindUserId(Map<String,Object> param);

	List<FindCode> FindPgmCode(Map<String,Object> param);

	/* 거래처찾기 */
	List<FindCode> FIND_CODE_DEPT(Map<String,Object> param);

	/* 거래처찾기 */
	List<FindCode> FIND_CODE_DEPT2(Map<String,Object> param);

	/* 물류센터찾기 */
	List<FindCode> FIND_CODE_SALECENTER(Map<String,Object> param);

	/* 보장기관찾기 */
	List<FindCode> FIND_CODE_COMDIV(Map<String,Object> param);

	/* 지사별고객찾기 */
	List<FindCode> FIND_CODE_CUST(Map<String,Object> param);

	/* 지사별고객찾기2 */
	List<FindCode> FIND_CODE_CUST2(Map<String,Object> param);

	/* 지사별고객찾기2 */
	List<FindCode> FIND_CODE_CUST2_OLD(Map<String,Object> param);

	/* 요양보호사찾기 */
	List<FindCode> FIND_CODE_MEMBER(Map<String,Object> param);

	/* 보호자 찾기 */
	List<FindCode> FIND_CUSTPROTECTOR(Map<String,Object> param);
	
}
