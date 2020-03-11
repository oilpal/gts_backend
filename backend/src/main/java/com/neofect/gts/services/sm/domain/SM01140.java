package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM01140")
@Data
public class SM01140 implements Serializable {

	private static final long serialVersionUID = -609397460656040330L;
	
	private String systemVersion;
	private String cuIp;
	private String companyCode;
	private String sensorid;               
	private String projCode;
	private String projName;
	private String installDate;
	private String installEmpNo;               
	private String returnDate;
	private String returnEmpNo;      
	
	
}
