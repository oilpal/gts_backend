package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("XG_APPR")
@Data
public class XG_APPR implements Serializable {
	
	private static final long serialVersionUID = 8361337679580595224L;
	
	private String apprUser;
	private String apprStat;
	private String companyCode;
	private String apprKey1;
	private String apprKey2;
}
