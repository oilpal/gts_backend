package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smCodeDept")
@Data
public class SmCodeDept implements Serializable {

	private static final long serialVersionUID = 3825814970093315660L;

	private String companyCode;        
	private String deptCode;           
	private String deptName;           
	private String deptSname;          
	private String deptEname;          
	private String deptEsname;         
	private String costCode;           
	private String deptDiv;            
	private String costdeptCode;       
	private String terminateDate;      
	private String businessCode;       
	private String sortOrder;          
	private String usingTag;           
	private String taxCompanyCode;    
	private String costTag;            
	private String officeCode;         
	private String budgetControltag;   
	private String taxOfficeCode;     
	private String costDeptCode;      
	private String residentPayPlace;  
	private String firstRegistDate;   
	private String payAcntCode;       
	private String bonusAcntCode;     
	private String areaDiv;            
	private String fcDept;             
	private String manufacDiv;         
	private String projDepositNo;     
	private String nationCd;           
	private String upperDeptCode;     
	private String deptTypeDiv;       
	private String bonbooCode;         
	private String silCode;            
	private String projSortOrder;     
	private String projDegreeNum;     
	private String orgDispYn;         
	private String taxDiv;             
	private String foodDepositYn;     
	private String accEndDate;        
	private String toSortOrder;       
	private String deptGroup;          
	private String ediManageNo; 
	
}
