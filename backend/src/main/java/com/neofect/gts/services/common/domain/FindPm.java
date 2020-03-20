package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findPm")
@Data
public class FindPm implements Serializable{

	private static final long serialVersionUID = 7414515143646055735L;

	private String empNo; 
	private String empName; 
	private String companyCode; 
	private String deptCode; 
	private String gradeCode; 
	private String joinDate; 
	private String retireDate; 
	private String deptName; 
	private String realDeptName; 
	private String gradeName; 
	private String deptDivCode; 
	private String levelCode; 
	private String levelName; 
	private String dutyCode; 
	private String dutyName; 
	private String curCompanyCode; 
	private String curCompanyName; 
	private String curDeptCode; 
	private String curDeptName;
	
}
