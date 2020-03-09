package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("martFindCode")
@Data
public class MatrFindCode implements Serializable {
	
	private static final long serialVersionUID = 7925350375215537751L;

	private String companyCode;
	private String matrCode;
	private String matrName;
	private String spec;
	private String unit;
	private String matrDiv;
	private String remark;
	private String typeCode;
	private String seq;
	
}
