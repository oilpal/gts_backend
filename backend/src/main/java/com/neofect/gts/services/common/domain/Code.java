package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("code")
@Data
public class Code implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String code;	
	private String label;	
	private String sysId;	
	private String hcode;	
	private String relateCode1;
	private String relateCode2;
	private String relateCode3;
	private String useYn;
	
}
