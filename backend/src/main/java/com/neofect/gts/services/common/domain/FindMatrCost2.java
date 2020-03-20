package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findMatrCost2")
@Data
public class FindMatrCost2 implements Serializable{

	private static final long serialVersionUID = 3500634396139750789L;

	private String flag;              
	private String flagName;         
	private String custCode;         
	private String custName;         
	private String masterYn;         
	private String minCost;          
	private String optCost;          
	private String estimateCost;     
	private String estimateRate;     
	private String orderCost;      
	private String strtDate;         
	private String bdcCost;
	private String costValue;        
	private String hstOrderCost;    
	private String histStrtDate;    
	private String costModify;
	private String makerCode;
	private String makerName;
	private String requestYymm;
	
}
