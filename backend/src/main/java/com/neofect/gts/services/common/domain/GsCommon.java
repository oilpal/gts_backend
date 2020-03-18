package com.neofect.gts.services.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("GS_COMMON")
@Data
public class GsCommon implements Serializable {

	private static final long serialVersionUID = -5386646392215727749L;
	
	private String remark;
	private String deptId;
	private String custId;
	private String yymm;
	private String level;
	private String rate;
	private String col;
	private String productCode;
	private String date;
	private String mLimitAmt;
	private String reqLimitAmt;
	private String prooffiDiv;
	private String appRateDiv;
	private String comdivName;
}
