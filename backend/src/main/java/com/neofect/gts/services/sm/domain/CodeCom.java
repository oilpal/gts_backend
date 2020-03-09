package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("codeCom")
@Data
public class CodeCom implements Serializable {

	private static final long serialVersionUID = 4249787097812136568L;

	private String code;
	private String label;
	
}
