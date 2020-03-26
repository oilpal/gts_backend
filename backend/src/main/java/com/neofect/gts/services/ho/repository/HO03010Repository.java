package com.neofect.gts.services.ho.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.ho.domain.HO03010;

/**
 * 임직원관리 Repository
 * @author cm
 *
 */
public interface HO03010Repository {

	/**
	 * [사용]임직원 관리 리스트
	 * 복사 완료
	 * HO03010_C01
	 * * dept, gubundiv, workyn, find 필요 
	 * @param param
	 * @return
	 */
	@Deprecated
	List<HO03010> getEmpManageList(Map<String, Object> param);

	/**
	 * [사용]주민번호조회?
	 * HO03010_R03
	 * * reg 필요 
	 * @param param
	 * @return
	 */
	@Deprecated
	List<HO03010> hO03010R03(Map<String, Object> param);

	/**
	 * [사용]사번검색?
	 * HO03010_R04
	 * * id 필요 
	 * @param param
	 * @return
	 */
	@Deprecated
	List<HO03010> hO03010R04(Map<String, Object> param);

	/**
	 * [사용]사번 count?
	 * MEMBER_DUP_CHK
	 * * id 필요 
	 * @param param
	 * @return
	 */
	@Deprecated
	List<HO03010> memberDupChk(Map<String, Object> param);

	/**
	 * 멤버 아이디 업데이트?
	 * MEMBER_ID_CHANGE (update)
	 * set MEMBER_ID = newid, EMP_NO = newid where oldid 필요
	 * @param param
	 * @return
	 */
	List<HO03010> memberIdChange(Map<String, Object> param);

	/**
	 * [사용]주민번호 체크
	 * CHK_JUMIN
	 * jumin, memberid 필요
	 * @param param
	 * @return
	 */
	@Deprecated
	List<HO03010> chkJumin(Map<String, Object> param);

	/**
	 * 주민번호 체크 old
	 * CHK_JUMIN
	 * regcode, memberid 필요
	 * @param param
	 * @return
	 */
	List<HO03010> chkJuminOld(Map<String, Object> param);

	/**
	 * 배상보험이력 추가
	 * CODE_LIINSURANCE_C01
	 * member 필요
	 * @param param
	 * @return
	 */
	List<HO03010> CODELIINSURANCEC01(Map<String, Object> param);

}
