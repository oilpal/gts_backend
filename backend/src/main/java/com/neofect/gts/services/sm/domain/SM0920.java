package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM0920")
@Data
public class SM0920 implements Serializable {
	
	private static final long serialVersionUID = 1824772574813728988L;
	
	private String companyCode;
	private String actCode;
	private String actName;
	private String actTag1;
	private String actTag2;
	private String actTag3;
	private String actTag4;
	private String actTag5;
	private String find;
	private String userId;
	private String userName;
	private String userTag;
	private String empNo;
	private String empName;
	private String deptCode;
	private String deptName;
	private String realDeptCode;
	private String realDeptName;
	private String gradeCode;
	private String gradeName;
	private String dutyCode;
	private String dutyName;
	private String joinDate;
	private String retireDate;
	private String rrnNo;
	private String userTagName;
}
