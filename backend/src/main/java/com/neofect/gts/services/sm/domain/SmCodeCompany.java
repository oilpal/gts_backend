package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smCodeCompany")
@Data
public class SmCodeCompany implements Serializable {

	private static final long serialVersionUID = 4782761718981100395L;

	private String companyCode;
	private String companyName;
	private String vendorNo;
	private String useYn;
	private String hrUseYn;
	private String vendorName;
	private String representName;
	private String representRrn;
	private String legalNo;
	private String bizStatus;
	private String bizType;
	private String phone;
	private String zipCode;
	private String addr1;
	private String addr2;
	private String firstSDate;
	private String amStartMonth;
	private String amSDate;
	private String amEDate;
	private String slipEvidCntYn;
	private String taxEvidIssueYn;
	private String bdgtResultYn;
	private String slipPrintName;
	private String chiAddr;
	private String chiName;
	private String chiRepresent;
	private String inputDutyId;
	private String inputDate;
	private String chgDutyId;
	private String chgDate;
	private String groupDiv;
	private String groupOrder;
	private String compOrder;
	private String outsourceYn;
	private String compEname;
	private String addr1Eng;
	private String addr2Eng;
	private String representEname;
	private String siteAddr;
	private String generalAcntUseYn;
	private String creditcardVatYn;
	private String projectCostYn;
	
}
