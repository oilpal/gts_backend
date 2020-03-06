package com.neofect.gts.services.gs.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("GS01090")
@Data
public class GS01090 implements Serializable {

	private static final long serialVersionUID = 2490124925184460760L;

	private String sId;
	private String serviceYn;
	private String custCode;
	private String custName;
	private String startTimeDiv;
	private String startMinDiv;
	private String endTimeDiv;
	private String endMinDiv;
	private String serviceMin;
	private String memberId;
	private String memberName;
	private String productDiv;
	private String productCode;
	private String productName;
	private String serviceAmt;
	private String payAmt;
	private String reqAmt;
	private String remainAmt;
	private String remark;
	private String complainMemo;
	private String carerMemo;
	private String enterId;
	private String enterDate;
	private String editId;
	private String editDate;
	private String smsYn;
	private String carerMemoyn;
	private String carerDate;
	private String deptMemoyn;
	private String deptDate;
	private String phone;
	private String hp;
	private String addr1;
	private String addr2;
	private String productId;
	private String wonMemberId;
	private String status;
	private String planDate;
	private String deptId;
	private String custId;
	private String introRate;
	private String serviceCost;
	private String serviceMin1;
	private String serviceMin2;
	private String serviceMin3;
	private String contSeq;
	private String date;
	private String info;
	private String stime;
	private String smin;
	private String etime;
	private String emin;
	private String familyYn;
	private String levelDiv;
}
