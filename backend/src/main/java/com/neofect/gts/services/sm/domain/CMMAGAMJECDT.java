package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("cmmagamjecdt")
@Data
public class CMMAGAMJECDT implements Serializable {

	private static final long serialVersionUID = -8220144736361176778L;

	private String code;
	private String name;
	    
}