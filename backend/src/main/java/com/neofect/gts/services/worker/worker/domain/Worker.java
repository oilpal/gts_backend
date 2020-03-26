package com.neofect.gts.services.worker.worker.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/**
 * 직원 정보 
 * @author jd
 *
 */
@Alias("EmployeeInfo")
@Data
public class Worker implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 사번
	 */
	private int memberId;
	/**
	 * 부서ID
	 */
	private int deptId;
	/**
	 * 부서명
	 */
	private String deptName;
	/**
	 * 정임직구분
	 */
	private String memberDiv;
	/**
	 * 
	 */
	private String empNo;
	/**
	 * 사원명
	 */
	private String name;
	/**
	 * 주민번호
	 */
	private String regCode;
	private String irthDt;
	/**
	 * 직급
	 */
	private String gubunDiv;
	/**
	 * 입사일자
	 */
	private String inDate;
	/**
	 * 퇴사일자
	 */
	private String retireDate;
	/**
	 * 재직여부
	 */
	private String workYn;
	private String workYear;
	/**
	 * 급여종류
	 */
	private String paytype;
	/**
	 * 최초 5대보험 신고된 기본급
	 */
	private String reportedincomeamt;
	/**
	 * 퇴직정산 방법
	 */
	private String retirecalctype;
	/**
	 *공제인원수 
	 */
	private String deductCnt;
	/**
	 * 기본시급
	 */
	private String hourpay;
	private String hourpay2;
	private String hourpay3;
	private String hourpay4;
	/**
	 * 장애유무
	 */
	private String handicapYn;
	private String handicapLevel;
	private String payupdateYn;
	
	/**
	 * 배상보험가입일
	 */
	private String liinsurancedate;
	/**
	 * 보험가입구분
	 */
	private String liinsurancetype;
	/**
	 * 배상보험종료일
	 */
	private String liinsuranceenddate;	
	/**
	 * 가족케어여부
	 */
	private String familyYn;
	/**
	 * 건강보험적용
	 */
	private String healthinsuretag;
	/**
	 * 국민연금적용
	 */
	private String nationalpensiontag;
	/**
	 * 고용보험적용
	 */
	private String goyongtag;
	
	/**
	 * 자격번호
	 */
	private String licenseNo;
	/**
	 * 자격등급
	 */
	private String licenselevelDiv;
	private String phone;
	private String hp;
	/**
	 * 우편번호
	 */
	private String zipCode;
	/**
	 * 이메일
	 */
	private String email;
	/**
	 * 업무이메일
	 */
	private String email2;
	/**
	 * 기본주소
	 */
	private String addr1;
	/**
	 * 상세주소
	 */
	private String addr2;
	/**
	 * 급여계좌정보의 은행 
	 */
	private String bankDiv;
	/**
	 * 급여계좌정보의 계좌번호
	 */
	private String depositno;
	/**
	 * 급여계좌정보의 예금주
	 */
	private String depositowner;
	/**
	 * 연차일수
	 */
	private String yearVacation	;
	/**
	 * 사용한 연차일수
	 */
	private String usedVacation;
	/**
	 * 등록일
	 */
	private String regDate;
	private String pwd;
	private String inputPwd;
	
	private String smsQuota1;
	private String smsQuota2;
	/**
	 * 복수근무지사명
	 */
	private String dupDeptName;
	private String pimg;
	private String pimgPath;
	private String pdir;
	private String minPayamt;
	private String traineeYn;
	private String traineeDate;
	private String firstAmt;
	private String rrnNo;
	private String inputRrnNo;
	private String remark;
	private String pageTag;
	/**
	 * 로그인LOCK
	 */
	private String loginLockYesno;
	private String seq;
	private Date startdate;
	private Date enddate;
	private String type;
	
	/**
	 * 회계관리자여부[현재 화면에서 안보임]
	 */
	private String ammasterYn;
	/**
	 * 프로그램권한[사용안함]
	 */
	private String authorityDiv;
	private String manychildYn;

}
