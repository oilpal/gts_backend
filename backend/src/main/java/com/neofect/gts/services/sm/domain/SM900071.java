package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM900071")
@Data
public class SM900071 implements Serializable {
	
	private static final long serialVersionUID = 1820167976622700965L;
	
	private String sysId;
	private String code;
	private String name;
	private String htmlString;
	private String htmlStringView;
	private String useYn;
	private String remk;
	private String scriptString;
	private String search;
	private String dataCnt;
	private String maxCode;
	private String header1;
	private String header2;
}
