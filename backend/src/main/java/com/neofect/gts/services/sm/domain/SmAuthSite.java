package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smAuthSite")
@Data
public class SmAuthSite implements Serializable {
	
	private static final long serialVersionUID = 6144481051742778967L;

	private String companyCode;
	private String userId;
	private String siteCode;
	private String fullName;
	private String useYesno;
	
}
