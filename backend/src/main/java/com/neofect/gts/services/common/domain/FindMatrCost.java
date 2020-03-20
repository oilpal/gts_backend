package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findMatrCost")
@Data
public class FindMatrCost implements Serializable{

	private static final long serialVersionUID = 1993929012298061417L;

	private String itemCode;
	private String itemName;
	private String custCode;
	private String custName;
	private String masterYn;
	private String estimateCost;
	private String estimateRate;
	private String orderCost;
	private String flag;
	private String flagName;
	private String minCost;
	private String optCost;
	private String c;
	private String costValue;
	private String bdcCost;
	private String strtDate;
	private String hstOrderCost;
	private String histStrtDate;
	
}
