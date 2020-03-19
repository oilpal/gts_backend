package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("selectDept")
@Data
public class SelectDept implements Serializable{

	private static final long serialVersionUID = -1651051613575509578L;

	private String deptId;
	private String deptName;
	private String operDiv;
	private String serviceCode;
	private String useYn;
	
}
