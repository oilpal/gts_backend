package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM0940")
@Data
public class SM0940 implements Serializable {
	
	private static final long serialVersionUID = 6902375283896818289L;
	
	private String sysId;
	private String pgmCode;
	private String menuCode;
	private String menuName;
	private String iA01;
	private String rA01;
	private String iA02;
	private String rA02;
	private String iA03;
	private String rA03;
	private String iA04;
	private String rA04;
	private String iA05;
	private String rA05;
	private String iA06;
	private String rA06;
	private String iA07;
	private String rA07;
	private String iB01;
	private String rB01;
	private String iB02;
	private String rB02;
	private String iB03;
	private String rB03;
	private String iB04;
	private String rB04;
	private String iB05;
	private String rB05;
	private String iB07;
	private String rB07;
	private String lev;
	private String companyCode;
}
