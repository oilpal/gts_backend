package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findMatrMaster2")
@Data
public class FindMatrMaster2 implements Serializable{

	private static final long serialVersionUID = 3088080130252377707L;
	
	private String itemName;
	private String itemStd;
	private String itemUnit;
	private String itemCode;
	private String upItemCode;
	private String upItemName;
}
