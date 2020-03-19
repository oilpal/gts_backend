package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findCode")
@Data
public class FindCode implements Serializable{

	private static final long serialVersionUID = 1426456279198986428L;

	private String companyCode;
	private String userId;
	private String userName;
	private String deptCd;
	private String userTag;
	private String userTagNm;
	private String sysId;
	private String pgmCode;
	private String sortCode;
	private String pgmName;
	private String deptId;
	private String deptName;
	private String operDiv;
	private String serviceCode;
	private String zipCode;
	private String addr1;
	private String addr2;
	private String phone;
	private String fax;
	private String ownerName;
	private String ownerHp;
	private String managerName;
	private String managerHp;
	private String bizNo;
	private String bizName;
	private String bizUptae;
	private String bizUpjong;
	private String bizAddr1;
	private String bizAddr2;
	private String rentBamt;
	private String remtMamt;
	private String operAmt;
	private String operDivName;
	private String useYn;
	private String manageOfficeDiv;
	private String manageOfficeDivName;
	private String custId;
	private String custCode;
	private String custName;
	private String birthDate;
	private String startDate;
	private String endDate;
	private String manageNo;
	private String manageNo1;
	private String manageNo2;
	private String copyManageNo;
	private String mLimitAmt;
	private String clientDiv;
	private String custLevelDiv;
	private String custLevelName;
	private String reductionName;
	private String appRateName;
	private String reductionDiv;
	private String memberId;
	private String empNo;
	private String memberName;
	private String liinsurancedate;
	private String hp;
	private String email;
	private String regCode;
	private String proSeq;
	private String proName;
	private String relationDiv;
	private String relationDivName;
	
}
