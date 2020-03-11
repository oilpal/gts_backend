package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smAuthSys")
@Data
public class SmAuthSys implements Serializable {
	
	private static final long serialVersionUID = 1120982512765151745L;
	
	private String sysId;
	private String sysName;
	private String useYn;
	private String sortOrder;
	private String sidepanelYn;
	private String code;
	private String label;
	
}
