package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smAuthUserMenu")
@Data
public class SmAuthUserMenu implements Serializable {

	private static final long serialVersionUID = -7418987278316448987L;

	private String authCode;
	private String sysId;
	private String pgmCode;
	private String sortCode;
	private String pgmName;
	private String authI;
	private String authR;
	private String authD;
	private String authP;
	private String authTag;
	
}
