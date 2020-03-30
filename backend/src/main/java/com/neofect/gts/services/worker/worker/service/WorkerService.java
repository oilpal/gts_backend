package com.neofect.gts.services.worker.worker.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.worker.worker.domain.Worker;
import com.neofect.gts.services.worker.worker.repository.WorkerRepository;

/**
 * 직원관리 > 직원정보 서비스
 * @author jd
 *
 */
@Service
public class WorkerService {

	@Autowired
	WorkerRepository repository;
	
	/**
	 * 임직원 관리 리스트
	 * HO03010_C01
	 * * dept, gubundiv, workyn, find 필요 
	 * @param param
	 * @return
	 */
	public List<Worker> selectWorkerInfoList(Map<String, Object> param){
		return repository.selectWorkerInfoList(param);
	}
	
	/**
	 * 직원 주민등록번호 중복확인 용 
	 * hO03010R03
	 * @param param
	 * @return
	 */
	public Worker selectWorkerRegistNumber(Map<String,Object> param) {
		return repository.selectWorkerRegistNumber(param);
	}
	
	/**
	 * 사번으로 입사일 퇴사일 정보 조회 
	 * hO03010R04
	 * @param param
	 * @return
	 */
	public Worker selectWorkerMemberId(Map<String,Object> param) {
		return repository.selectWorkerMemberId(param);
	}
	
	/**
	 * 주민번호 체크 ( jumin , memberid ) 
	 * CHK_JUMIN
	 * @param param
	 * @return
	 */
	public Worker selectWorkerCheckRegistNumber(Map<String,Object> param) {
		return repository.selectWorkerCheckRegistNumber(param);
	}
	
	/**
	 * 사번 중복 체크 
	 * MEMBER_DUP_CHK
	 * @param param
	 * @return
	 */
	public int selectWorkerMemberIdDuplicateCheck(Map<String,Object> param) {
		return repository.selectWorkerMemberIdDuplicateCheck(param);
	}
}
