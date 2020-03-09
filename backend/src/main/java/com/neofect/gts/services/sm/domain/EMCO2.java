package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("emco2")
@Data
public class EMCO2 implements Serializable {

	private static final long serialVersionUID = 6560341327974309855L;

	private String applyDate;
	private String emDiv1;
	private String emDiv2;
	private String emDiv1Name;
	private String emDiv2Name;
	private String emDiv;
	private String chUnit;
	private String chValue;
	private String oilUnit;
	private String oilValue;
	private String cokgValue;
	private String cotonValue; 
	
}
