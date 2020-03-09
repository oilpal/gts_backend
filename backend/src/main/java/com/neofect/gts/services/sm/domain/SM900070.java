package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM900070")
@Data
public class SM900070 implements Serializable {
	
	private static final long serialVersionUID = -2562349810604763887L;
	
	private String sysIdl;
	private String codel;
	private String namel;
	private String htmlStringl;
	private String htmlStringViewl;
	private String useYnl;
	private String remkl;
	private String scriptStringl;
	private String searchl;
}
