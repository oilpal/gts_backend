package com.neofect.gts.services.gs.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("GS02020")
@Data
public class GS02020 implements Serializable {

	private static final long serialVersionUID = 3646890314273524208L;
	
	private String memberId;
	private String deptId;
	private String yyyymm;
	private String workType;
	private String deptName;
	private String empNo;
	private String name;
	private String inputRrnNo;
	private String workTypeName;
	private String payTotal;
	private String payBasic;
	private String payWeek;
	private String payVacation;
	private String payEtc;
	private String workDays;
	private String hourTotal;
	private String hourBasic;
	private String hourExtra;
	private String hourNight;
	private String hourHoliday;
	private String amtIncentive;
	private String amtBasic;
	private String amtWeek;
	private String amtVacation;
	private String amtExtra;
	private String amtNight;
	private String amtHoliday;
	private String amtEtc;
	private String amtSpecial;
	private String totPayAmt;
	private String remark;
	private String payIncentive;
	private String productSname;
	private String memberName;
	private String regCode;
	private String payDate;
	private String totalAmt;
	private String totalHour;
	private String taxableAmt;
	private String nottaxableAmt;
	private String incomeTaxAmt;
	private String residenceTaxAmt;
	private String pensionAmt;
	private String healthinsureAmt;
	private String longtermAmt;
	private String employinsureAmt;
	private String totalIncentiveAmt;
	private String etcdeductionAmt;
	private String deductionAmt;
	private String payTotAmt;
	private String realPayAmt;
	private String bankDiv;
	private String bankName;
	private String depositno;
	private String depositowner;
	private String cHealthinsureAmt;
	private String cPensionAmt;
	private String cIndaccAmt;
	private String cEmpinsuAmt;
	private String cLongtermAmt;
	private String cRetireAmt;
	private String cEmpinsu2Amt;
	private String memberAge;
	private String deductCnt;
	private String serviceYn;
	private String custId;
	private String custCode;
	private String custName;
	private String familyYn;
	private String planDate;
	private String startTime;
	private String endTime;
	private String serviceMin;
	private String productId;
	private String productCode;
	private String productName;
	private String serviceAmt;
	private String payAmt;
	private String reqAmt;
	private String payMin1;
	private String payMin2;
	private String payMin3;
	private String serviceMin1;
	private String serviceMin2;
	private String serviceMin3;
	private String serviceYnDiv;
	private String serviceRemark;
	private String remainAmt;
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
	private String dupliserviceYn;
	private String serviceCost;
	private String fromDate;
	private String toDate;
}
