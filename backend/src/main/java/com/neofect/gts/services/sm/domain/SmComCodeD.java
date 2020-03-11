package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smComCodeD")
@Data
public class SmComCodeD implements Serializable {

	private static final long serialVersionUID = -1520302401747593387L;

	private String dcode;
	private String dname;
	private String dname1;
	private String dvalue;
	private String dvalue2;
	private String code;
	private String label;
	
}
