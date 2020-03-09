package com.neofect.gts.services.gs.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("GS01070")
@Data
public class GS01070 implements Serializable {

	private static final long serialVersionUID = -1764092002462986996L;

	private String deptId;
	private String deptName;
	private String memberId;
	private String memberName;
	private String custCode;
	private String custName;
	private String familyYn;
	private String custLevelDiv;
	private String reductionDiv;
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
	private String serviceYn;
	private String deptid;
	private String fromdate;
	private String todate;
	private String serviceyn;
	private String member;
	private String custcode;
	private String empname;
}
