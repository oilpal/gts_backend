package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM0930")
@Data
public class SM0930 implements Serializable {
	
	private static final long serialVersionUID = -6996576998093112338L;
	
	private String companyCode;
	private String userGroupCode;
	private String userGroupName;
	private String remarks;
	private String sysId;
	private String pgmCode;
	private String menuCode;
	private String menuName;
	private String authI;
	private String authR;
	private String authD;
	private String authP;
	private String authE;
	private String lev;
	private String newMode;
}
