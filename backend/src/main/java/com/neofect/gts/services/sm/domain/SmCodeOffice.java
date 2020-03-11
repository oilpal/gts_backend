package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smCodeOffice")
@Data
public class SmCodeOffice implements Serializable {

	private static final long serialVersionUID = -7893645513324013265L;

	private String companyCode;
	private String officeCode;
	private String officeName;
	private String officesName;
	private String compNo;
	private String owner;
	private String condition;
	private String category;
	private String zip;
	private String addr;
	private String addr2;
	private String estabDate;
	private String term;
	private String closeDate;
	private String companyRegno;
	private String budgetBasicTag;
	private String taxOfficeName;
	private String tel;
	private String startDate;
	private String endDate;
	private String depositNo;
	private String bankName;
	private String ownerNo;
	private String sumTag;
	private String bankCode;
	private String remark;
	private String taxOfficeCode;
	
}
