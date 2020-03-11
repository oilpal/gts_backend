package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smCodeBank")
@Data
public class SmCodeBank implements Serializable {

	private static final long serialVersionUID = -3945260949915808497L;
	
	private String bankCode; 
	private String bankName; 
	private String usingTag; 
	private String checkTag; 
	private String limitAmt; 
	private String billTag; 
	private String trustTag; 
	private String billBankCode; 
	private String dislimitAmt; 
	private String officialBankCode;
	private String listOrder; 
	private String shortName;
	private String bankEname;
	private String bankDiv;
	private String cmUseYn;
	
}
