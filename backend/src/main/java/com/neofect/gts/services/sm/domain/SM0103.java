package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("sm0103")
@Data
public class SM0103 implements Serializable {

	private static final long serialVersionUID = 5088240321658683485L;

	private String compCode;
	private String hcode;
	private String hname;
	private String remarks;
	private String dcode;
	private String dname;
	private String value1;
	private String value2;
	private String value3;
	private String useYn;
	
}
