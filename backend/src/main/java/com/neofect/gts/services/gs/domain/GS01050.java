package com.neofect.gts.services.gs.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("GS01040")
@Data
public class GS01050 implements Serializable {

	private static final long serialVersionUID = 1325121671752013304L;

	private String sId;
	private String deptId;
	private String memberId;
	private String planDate;
	private String startTimeDiv;
	private String startMinDiv;
	private String endTimeDiv;
	private String endMinDiv;
	private String serviceMin;
	private String productId;
	private String serviceAmt;
	private String payAmt;
	private String reqAmt;
	private String remainAmt;
	private String custId;
	private String REMARK;
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
	private String custCode;
	private String custName;
	private String phone;
	private String hp;
	private String addr1;
	private String addr2;
	private String memberName;
	private String productName;
	private String productCode;
	private String introRate;
	private String SAVETAG;
	private String serviceCost;
	private String serviceMin1;
	private String serviceMin2;
	private String serviceMin3;
	private String contSeq;
	private String amt1;
	private String amt2;
	private String amt3;
	private String familyYn;
	private String familyRef;
	private String dupliserviceYn;
	private String dupliserviceSeq;
	private String yymm;
	private String productCodeMove;
	private String productCodeBath;
	private String amtMeal;
	private String date;
	private String info;
	private String stime;
	private String smin;
	private String etime;
	private String emin;
	private String productDiv;
	private String levelDiv;
	private String saleAmt;
	private String serviceTime;
	private String serviceType;
	private String serviceCnt;
	private String totalBAmt;
	private String totalAmt;
	private String seq;
	private String serviceDiv;
	private String bAmt;
	private String payBAmt;
	private String saturdayYn;
	private String sundayYn;
	private String holidayYn;
	private String holidayName;
	private String daynum;
}
