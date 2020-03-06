package com.neofect.gts.services.gs.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("GS01020")
@Data
public class GS01020 implements Serializable {

	private static final long serialVersionUID = 3003745703309636978L;
	
	private Integer custId;
	private String custCode;
	private String custName;
	private String bizRegno;
	private Date startDate;
	private Date endDate;
	private String deptId;
	private String deptName;
	private String orderNum;
	private Date careEdateDday;
	private Date birthDate;
	private String contSeq;
	private Integer sortOrder;
	private String manageStatus;
	private String phone;
	private String hp;
	private String addr1;
	private String addr2;
	private String manageNo;
	private String custLevelDiv;
	private Integer mLimitAmt;
	private String careSdate;
	private String careEdate;
	private String masterPlan;
	private String contSdate;
	private String contEdate;
	private Integer proSeq;
	private String proName;
	private String relationDiv;
	private String relationDivName;
	private String proZipCode;
	private String proAddr1;
	private String proAddr2;
	private String proPhone;
	private String proHp ;
	private String proEmail;
	private String memberId;
	private Date regDate;
	private String changeDate;
	private String changeReason;
	private String changeId;
	private String changeDatetime;
	private Date cancelDate;
	private String cancelReason;
	private String cancelId;
	private String cancelDatetime;
	private String serviceContDiv;
	private String introId;
	private String reductionDiv;
	private Integer reqLimitAmt;
	private Integer officeAmt;
	private String appRateDiv;
	private String zipCode;
	private String manageNo1;
	private String manageNo2;
	private String contDeptDiv;
	private String contCalcDay;
	private String contNotiDay;
	private String contPayDay;
	private String contWriteDay;
	private String contPayMethod;
	private String contDate;
	private String contMemberName;
	private String contWriteDate;
	private String memberName;
	private String planDate;
	private String dayNm;
	private String startTime;
	private String endTime;
	private String serviceMin;
	private String productId;
	private String productCode;
	private String productName;
	private String serviceAmt;
	private String payAmt;
	private String reqAmt;
	private String remainAmt;
	private String encCustCode;
	private String remark;
	private String serviceYn;
	private String wonMemberId;
	private String complainMemo;
	private String carerMemo;
	private String enterId;
	private String enterDate;
	private String editId;
	private String editDate;
	private String smsYn;
	private String status;
	private String carerMemoyn;
	private String carerDate;
	private String deptMemoyn;
	private String deptDate;
	private String serviceYnDiv;
	private String serviceRemark;
	private String dupliserviceYn;
	private String sId;
	private String discountAmt;
	private String planSeq;
	private String monYn;
	private String tueYn;
	private String wedYn;
	private String thuYn;
	private String friYn;
	private String satYn;
	private String sunYn;
	private String fromHour;
	private String fromMin;
	private String toHour;
	private String toMin;
	private String weekYn;
	private String week2Yn;
	private String monthYn;
	private String nseq;
	private String birth;
	private String address;
	private String custLevelName;
	
	private String alldate;
}
