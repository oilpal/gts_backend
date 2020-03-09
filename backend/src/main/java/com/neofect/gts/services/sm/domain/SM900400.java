package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM900400")
@Data
public class SM900400 implements Serializable {
	
	private static final long serialVersionUID = -2257040602256612344L;
	
	private String companyCode;
	private String userId;
	private String recSeq;
	private String empCompanyCode;
	private String empNo;
	private String gubunCode;
	private String recName;
	private String hpNo;
}
