package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("selectEmp")
@Data
public class SelectEmp implements Serializable{

	private static final long serialVersionUID = -2106428977364054086L;

	private String memberId;
	private String memberName;
	private String gubunDiv;
	private String deptId;
	private String deptName;
	private String memberDiv;
	private String workYn;
	
}
