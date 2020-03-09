package com.neofect.gts.services.gs.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("GS02030")
@Data
public class GS02030 implements Serializable {

	private static final long serialVersionUID = -6718584987890492226L;
	
	private String memberId;
	private String memberName;
	private String deptId;
	private String yymm;
	private String serviceYn;
	private String custCode;
	private String custName;
	private String startTimeDiv;
	private String startMinDiv;
	private String endTimeDiv;
	private String endMinDiv;
	private String serviceMin;
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
	private String introRate;
	private String productId;
	private String status;
	private String wonMemberId;
	private String planDate;
	private String sId;
	private String custId;
	private String no;
	private String info;
	private String min1;
	private String min2;
	private String min3;
	private String totalMin;
}
