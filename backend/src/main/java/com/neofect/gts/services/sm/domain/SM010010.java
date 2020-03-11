package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM010010")
@Data
public class SM010010 implements Serializable {

	private static final long serialVersionUID = 3603711594676702120L;
	
	private String centerCode;
	private String centerName;
	private String vendorNo;
	private String repretName;
	private String postCode;
	private String address1;
	private String address2;
	private String reportDiv;
	private String taxManageNo;
	private String mainPhoneno;
	private String mainFaxno;
	private String mainEmail;
	private String estabYear;
	private String homepageUrl;

}
