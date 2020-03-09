package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM900700")
@Data
public class SM900700 implements Serializable {
	
	private static final long serialVersionUID = -2972799598686700362L;
	
	private String id;
	private String lev;
	private String parent;
	private String name;
	private String pName;
	private String num;
}
