package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findSiteCode")
@Data
public class FindSiteCode implements Serializable {
	
	private static final long serialVersionUID = 4666579730220633528L;
	
	private String siteCode;
	private String siteFullname;
	private String siteName;
	
}
