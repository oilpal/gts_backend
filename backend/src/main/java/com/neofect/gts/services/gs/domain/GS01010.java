package com.neofect.gts.services.gs.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("GS01010")
@Data
public class GS01010 implements Serializable {

	private static final long serialVersionUID = 8346000470571182403L;
	
	private Integer custId;
	private String clientDiv;
	private String deptId;
	private String deptName;
	private String custCode;
	private String custName;
	private String bizRegno;
	private String bizOwner;
	private String bizUptae;
	private String bizUpjong;
	private String zipCode;
	private String addr1;
	private String addr2;
	private String dmZipCode;
	private String dmAddr1;
	private String dmAddr2;
	private String phone;
	private String fax;
	private String hp;
	private String email;
	private String managerName;
	private String managerPhone;
	private String managerHp;
	private String vatDiv;
	private String remainAmt;
	private String depositno;
	private String bankDiv;
	private String custGubunDiv;
	private String custLevelDiv;
	private String appRateDiv;
	private String reductionDiv;
	private String manageNo;
	private Date startDate;
	private Date endDate;
	private String manageOfficeDiv;
	private String manageOfficeDivName;
	private Date birthDate;
	private String moonYn;
	private Date wedDate;
	private Date regDate;
	private String chkAddr;
	private String rrnNo;
	private String manageYn;
	private String inputRrnNo;
	private String manageNo1;
	private String manageNo2;
	private String memberId;
	private Integer proSeq;
	private Integer mLimitAmt;
	private Integer reqLimitAmt;
	private Integer officeAmt;
	private String jiroNo;
	private String proName;
	private String relationDiv;
	private String proBirth;
	private String proEmail;
	private String proPhone;
	private String proHp;
	private String proZipCode;
	private String proAddr1;
	private String proAddr2;
	private Date cancelDate;
	private Date contEdateDday;
	private Date cancelDateDday;
	private Date careEdateDday;
	private String cashReceiptNo;
	private String virtualDeposit;
	private String sex;
	private String mainDis;
	private Integer sortOrder;
	private String copyManageNo;
	private String manageStatus;
	private String juminChkYn;
	private Integer seq;
	private String useYn;
	private String remark;
	private Integer inCnt;
	private Integer outCnt;
	private String birth;
	private String rowInputDate;
	private String rowInputEmpNo;
	private String rowInputIp;
	private String custLaevelName;
	private String reductionDivName;
	
	private String alldate;
	
	private String selected;
}
