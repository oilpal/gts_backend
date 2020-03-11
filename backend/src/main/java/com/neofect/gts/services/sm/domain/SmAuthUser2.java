package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smAuthUser2")
@Data
public class SmAuthUser2 implements Serializable {
	
	private static final long serialVersionUID = -5909648968532197387L;
	
	private String companyCode;
	private String userId;
	private String userName;
	private String userDesc;
	private String code;
	private String label;
	private String sysId;
	private String pgmCode;
	private String menuCode;
	private String menuName;
	private String authI;
	private String authR;
	private String authD;
	private String authP;
	private String authE;
	private String sortOrder;
	
}
