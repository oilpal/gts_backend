package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("insertCmSaleAmtModify")
@Data
public class InsertCmSaleAmtModify implements Serializable{

	private static final long serialVersionUID = -1516547901291871851L;
	
	private String orderDocno; 
	private String orderName;
	private String saleAmt;  
	private String buyAmt;
	private String orderId;
	private String calcSeq;
	private String calcYymm;
	private String custId;
	private String custName; 
	private String supplyAmt; 
	private String vatAmt;
	private String totAmt;
	private String modCost; 
	private String billSeq;
	private String maxSeq;
	
}
