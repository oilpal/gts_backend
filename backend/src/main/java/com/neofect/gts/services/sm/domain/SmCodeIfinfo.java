package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smCodeIfinfo")
@Data
public class SmCodeIfinfo implements Serializable {

	private static final long serialVersionUID = 4287804822349898935L;

	private String value;
	
}
