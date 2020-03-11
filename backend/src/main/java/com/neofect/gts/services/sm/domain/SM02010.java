package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM02010")
@Data
public class SM02010 implements Serializable {

	private static final long serialVersionUID = 7485631277114788981L;
	
	private String companyCode;
	private String companyName;
	private String vendorNo;
	private String useYn;
	private String bdgtResultYn;
	private String hrUseYn;
	private String groupDiv;
	private String vendorName;
	private String representName;
	private String representRrn;
	private String legalNo   ;
	private String bizStatus;
	private String bizType;
	private String phone;
	private String zipCode;
	private String addr1 ;
	private String addr2;
	private String firstSDate;
	private String amStartMonth;
	private String amSDate;
	private String amEDate;
	private String slipEvidCntYn;
	private String taxEvidIssueYn;
	private String slipPrintName;
	private String chiAddr;
	private String chiName;
	private String chiRepresent;
	private String inputDutyId;
	private String inputDate;
	private String chgDutyId;
	private String chgDate;
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
