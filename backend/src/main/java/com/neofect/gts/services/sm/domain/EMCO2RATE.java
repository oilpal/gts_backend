package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("emco2rate")
@Data
public class EMCO2RATE implements Serializable {

	private static final long serialVersionUID = -247280266281421823L;

	private String companyCode;
	private String energyPwr;
	private String co2convCode;
	private String co2convName;
	private String stdDate;
	private String convUnit;
	private String convCal;
	private String oilUnit;
	private String oilFactor;
	private String co2EmitKg;
	private String co2EmitTon;
	
}
