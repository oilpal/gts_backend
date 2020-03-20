package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findSapCode")
@Data
public class FindSapCode implements Serializable{

	private static final long serialVersionUID = 6043488117046561903L;

	private String vendorDiv;
	private String smtpAddr;
	private String j1kftind;
	private String j1kftbus;
	private String brsch;
	private String kunnr;
	private String name1;
	private String ktokd;
	private String stcd2;
	private String stcd1;
	private String stcd12;
	private String j1kfrepre;
	private String telf1;
	private String telfx;
	private String pstlz;
	private String ort01;
	private String stras;
	
}
