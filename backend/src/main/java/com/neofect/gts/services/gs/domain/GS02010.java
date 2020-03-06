package com.neofect.gts.services.gs.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("GS02010")
@Data
public class GS02010 implements Serializable {

	private static final long serialVersionUID = -1886626291284446762L;
	
	private String memberId;
	private String deptId;
	private String deptName;
	private String empNo;
	private String name;
	private String memberDiv;
	private String birthDate;
	private String regCode;
	private String gubunDiv;
	private String inDate;
	private String retireDate;
	private String careerYy;
	private String hourpay;
	private String hourpay2;
	private String hourpay3;
	private String hourpay4;
	private String handicapYn;
	private String handicapLevel;
	private String workYn;
	private String licenseNo;
	private String licenselevelDiv;
	private String phone;
	private String hp;
	private String zipCode;
	private String email;
	private String addr1;
	private String addr2;
	private String bankDiv;
	private String depositno;
	private String regDate;
	private String pwd;
	private String ammasterYn;
	private String authorityDiv;
	private String email2;
	private String yearVacation;
	private String usedVacation;
	private String retirecalctype;
	private String reportedincomeamt;
	private String paytype;
	private String payupdateYn;
	private String deductCnt;
	private String manychildYn;
	private String liinsurancedate;
	private String liinsurancetype;
	private String liinsuranceenddate;
	private String depositowner;
	private String smsQuota1;
	private String smsQuota2;
	private String dupDeptName;
	private String healthinsuretag;
	private String nationalpensiontag;
	private String pimg;
	private String pdir;
	private String familyYn;
	private String goyongtag;
	private String minPayamt;
	private String traineeYn;
	private String traineeDate;
	private String remark;
	private String firstAmt;
	private String inputRrnNo;
	private String rrnNo;
	private String encRrnNo;
	private String newId;
	private String memYn;
	private String rcnt;
	private String tel ;
	private String birth;
	private String hpay1;
	private String hpay2;
	private String hpay3;
	private String weekpay;
	private String vacpay;
	private String totalpay1;
	private String totalpay2;
	private String totalpay3;

}
