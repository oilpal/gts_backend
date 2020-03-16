package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("common")
@Data
public class Common implements Serializable{
	
	private static final long serialVersionUID = -7953129659684061149L;
	
	private String code;
	private String label;
	private String cnt;
	private String sysId;
	private String pgmCode;
	private String pgmName;
	private String openDate;
	private String openCnt;
	private String pgmUrl;
	private String pageLink;
	private String procClass;
	private String custId;
	private String custName;
	private String acntCode;
	private String acntName;
	private String acntLevel;
	private String acntGroup;
	private String mmUseTag;
	private String cmUseTag;
	private String masterYn;
	private String fileNum;
	private String email;
	private String companyCode;		
	private String userId;			
	private String userName;		
	private String posCode;			
	private String useYn;
	private String userTag;			
	private String deptCode;		
	private String vendorCode;		
	private String mobileNo;		
	private String eMail;
	private String filePath;
	private String fileStreCours;
	private String streFileNm;
	private String orignlFileNm;
	private String deptName;
	private String encRrnNo;
	private String authorityDiv;
	
}
