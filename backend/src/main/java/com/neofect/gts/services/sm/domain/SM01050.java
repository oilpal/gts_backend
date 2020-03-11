package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("sm01050")
@Data
public class SM01050 implements Serializable {

	private static final long serialVersionUID = 7176915930538346964L;
	
	private String companyCode;			
	private String deptCode;			
	private String deptName;			
	private String deptEname;			
	private String taxCompanyCode;	
	private String costTag;			
	private String costCode;			
	private String levels;				
	private String level1;				
	private String level2;				
	private String level3;				
	private String sortOrder;			
	private String usingTag;			
	private String officeCode;			
	private String groupCode;			
	private String budgetControltag;	

}
