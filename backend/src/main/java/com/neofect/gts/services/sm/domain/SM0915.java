package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM0915")
@Data
public class SM0915 implements Serializable {
	
	private static final long serialVersionUID = -5822916049054577610L;
	
	private String companyCode;
	private String userId;
	private String userName;
	private String gradeCode;
	private String gradeName;
	private String userTag;
	private String userTagName;
	private String deptCode;
	private String deptName;
	private String useYn;
	private String loginTime;
	private String logoutTime;
	private String dutyName;
	private String find;
	private String type;
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
