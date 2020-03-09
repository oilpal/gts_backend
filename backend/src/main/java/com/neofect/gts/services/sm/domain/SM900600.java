package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM900600")
@Data
public class SM900600 implements Serializable {
	
	private static final long serialVersionUID = -6761064166525323097L;
	
	private String companyCode;
	private String userId;
	private String userName;
}
