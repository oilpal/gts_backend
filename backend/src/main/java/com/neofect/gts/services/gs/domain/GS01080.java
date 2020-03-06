package com.neofect.gts.services.gs.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("GS01080")
@Data
public class GS01080 implements Serializable {

	private static final long serialVersionUID = -3343363179715025982L;
	
	private String deptId;
	private String custId;
	private String custCode;
	private String custName;
	private String birthDat;
	private String payAm;
	private String misuAm;
	private String thisPayAm;
	private String reqAm;
	private String PAIDAMT;
	private String yymm;
	private String reductionDiv;
	private String YYYYMM;
	private String payAmt;
	private String misuAmt;
	private String reqAmt;
	private String payDate;
	private String checkYn;
	private String reqYymm;
	private String cardAmt;
	private String bankAmt;
	private String vbankAmt;
	private String jiroAmt;
	private String depositno;
	private String depositName;
	private String vbankDeposit;
	private String remark;
	private String cashAmt;
	private String enterId;
	private String enterDate;
	private String editId;
	private String editDate;
}
