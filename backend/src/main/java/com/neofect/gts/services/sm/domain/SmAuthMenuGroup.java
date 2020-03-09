package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smAuthMenuGroup")
@Data
public class SmAuthMenuGroup implements Serializable {
	
	private static final long serialVersionUID = -2732139553185885450L;
	
	private String menuAuth;
	private String menuAuthName;
	private String menuAuthDesc;
	private String useYn;
	private String code;
	private String label;
	
}
