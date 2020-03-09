package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smAuthGroup")
@Data
public class SmAuthGroup implements Serializable {
	
	private static final long serialVersionUID = 3815748489112920167L;
	
	private String companyCode;
	private String userGroupCode;
	private String userGroupName;
	private String remarks;
	private String menuAuth;
	private String menuAuthName;
	private String menuAuthDesc;
	
}
