package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("authMenu")
@Data
public class AuthMenu implements Serializable {

	private static final long serialVersionUID = 5382758010991595576L;

	private String menuLevel;
	private String pgmCode;
	private String pgmName;
	private String menuOrder;
	
}
