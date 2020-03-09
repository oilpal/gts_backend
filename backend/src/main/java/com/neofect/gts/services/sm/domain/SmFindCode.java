package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SmFindCode")
@Data
public class SmFindCode implements Serializable {
	
	private static final long serialVersionUID = 1609610454957720134L;
	
	private String sysId;
	private String pgmCode;
	private String sortCode;
	private String pgmName;
	private String pgm;
	private String userId;
	private String companyCode;
	private String equipStdCode;
	private String partId;
	private String partName;
	private String sulbi;
	private String equip;
	private String find;
	private String group;
	private String search;
}
