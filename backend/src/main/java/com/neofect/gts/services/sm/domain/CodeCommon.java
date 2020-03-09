package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("codeCommon")
@Data
public class CodeCommon implements Serializable {

	private static final long serialVersionUID = 2031068318667114594L;
	
	private String code;
	private String label;
	
}
