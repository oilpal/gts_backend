package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("Bivendor")
@Data
public class BIVENDOR implements Serializable {

	private static final long serialVersionUID = -2758958394573151488L;

	private String CODE;
	private String LABEL;
	private String vendorCode;
	private String vendorName;
	private String ktokd;
	private String bizRegNo;
	private String juminNo;
	private String ownerName;
	private String phoneNo;
	private String faxNo;
	private String postNo;
	private String addr;
	private String addr2;
	private String add3;
	private String corpRegNo;
	private String vendorDiv;
	private String vendorType;
	private String companyCode;
	private String seq;
	private String email;
	private String j1kftind;
	private String j1kftbus;
	private String stcd5;
	private String stcd3;
	private String brsch;
	private String bankDiv;
	private String accName;
	private String accNo;
	private String accHolder;
	private String remark;
	private String activeStatus;
	
}
