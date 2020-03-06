package com.neofect.gts.services.ho.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("HO03010")
@Data
public class HO03010 implements Serializable{

	private static final long serialVersionUID = 3537278458436207130L;

	private int memberId;
	private int deptId;
	private String deptName;
	private String memberDiv;
	private String empNo;
	private String name;
	private String regCode;
	private String irthDt;
	private String gubunDiv;
	private String inDate;
	private String retireDate;
	private String workYear;
	private String hourpay;
	private String hourpay2;
	private String hourpay3;
	private String hourpay4;
	private String handicapYn;
	private String handicapLevel;
	private String workYn;
	private String paytype;
	private String payupdateYn;
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
	private String inputPwd;
	private String ammasterYn;
	private String authorityDiv;
	private String email2;
	private String yearVacation	;
	private String usedVacation;
	private String retirecalctype;
	private String reportedincomeamt;
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
	private String pimgPath;
	private String pdir;
	private String familyYn;
	private String goyongtag;
	private String minPayamt;
	private String traineeYn;
	private String traineeDate;
	private String firstAmt;
	private String rrnNo;
	private String inputRrnNo;
	private String remark;
	private String pageTag;
	private String loginLockYesno;
	private String seq;
	private Date startdate;
	private Date enddate;
	private String type;
	
}
