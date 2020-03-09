package com.neofect.gts.services.gs.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("GS01060")
@Data
public class GS01060 implements Serializable {

	private static final long serialVersionUID = -2305856416197091917L;
	
	private String deptId;
	private String custId;
	private String yyyymm;
	private String custCode;
	private String deptName;
	private String custName;
	private String birthDate;
	private String reductionName;
	private String appRate;
	private String grdName;
	private String reqAmt;
	private String payAmt;
	private String paySum;
	private String bpayAmt;
	private String payTot;
	private String custindept;
	private String sId;
	private String memberId;
	private String memberName;
	private String familyYn;
	private String appRateDiv;
	private String planDate;
	private String dayNm;
	private String startTimeDiv;
	private String startMinDiv;
	private String endTimeDiv;
	private String endMinDiv;
	private String serviceMin;
	private String productId;
	private String productCode;
	private String productName;
	private String serviceAmt;
	private String remainAmt;
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
	private String discountAmt;
	private String custLevelDiv;
	private String reductionDiv;
}
