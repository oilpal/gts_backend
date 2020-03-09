package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smAutGrouphMenu")
@Data
public class SmAuthGroupMenu implements Serializable {
	
	private static final long serialVersionUID = -2732139553185885450L;
	
	private String companyCode;
	private String userGroupCode;
	private String sysId;
	private String pgmCode;
	private String pgmName;
	private String menuCode;
	private String menuName;
	private String sortOrder;
	private String authI;
	private String authR;
	private String authD;
	private String authP;
	private String authE;
	private String menuAuth;
	private String menuAuthName;
	private String menuAuthDesc;
	private String code;
	private String label;
	
}
