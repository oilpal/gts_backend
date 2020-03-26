package com.neofect.gts.services.worker.worker.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.worker.worker.domain.Worker;

/**
 * 직원정보 Repository
 * @author jd
 *
 */
public interface WorkerRepository {

	/**
	 * 임직원 관리 리스트
	 * HO03010_C01
	 * * dept, gubundiv, workyn, find 필요 
	 * @param param
	 * @return
	 */
	List<Worker> selectWorkerInfoList(Map<String, Object> param);
	
	/**
	 * 직원 주민등록번호 중복확인 용 
	 * HO03010_R03
	 * @param param
	 * @return
	 */
	Worker selectWorkerRegistNumber(Map<String,Object> param);
	
	/**
	 * 사번으로 입사일 퇴사일 정보 조회 
	 * HO03010_R04
	 * @param param
	 * @return
	 */
	Worker selectWorkerMemberId(Map<String,Object> param);
	
	/**
	 * 사번 중복 체크 
	 * MEMBER_DUP_CHK
	 * @param param
	 * @return
	 */
	int selectWorkerMemberIdDuplicateCheck(Map<String,Object> param);
	
	/**
	 * 주민번호 체크 ( jumin , memberid ) 
	 * CHK_JUMIN
	 * @param param
	 * @return
	 */
	Worker selectWorkerCheckRegistNumber(Map<String,Object> param);
}
