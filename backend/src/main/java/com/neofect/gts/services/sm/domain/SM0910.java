package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM0910")
@Data
public class SM0910 implements Serializable {

	private static final long serialVersionUID = 6702345460741916604L;
	
	private String companyCode;
	private String userGroupCode;
	private String userGroupName;
	private String userId;
	private String deptName;
	private String userName;
	private String userTag;
	private String empNo;
	private String empName;
	private String deptCode;
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
	private String remarks;
	private String find;
}
