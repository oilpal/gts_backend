package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findMatrCust")
@Data
public class FindMatrCust implements Serializable{

	private static final long serialVersionUID = 6386031217314629443L;

	private String itemCode;
	private String itemName;
	private String itemStd;
	private String itemUnit;
	private String estimateCost;
	private String itemMaker;
	private String makerName;
	private String code;
	private String label;
	
}
