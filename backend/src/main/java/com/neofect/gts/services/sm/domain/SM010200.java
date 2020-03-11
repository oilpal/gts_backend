package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM010200")
@Data
public class SM010200 implements Serializable {

	private static final long serialVersionUID = 5617357517063748433L;
	
	private String companyCode;
	private String deptCode;
	private String objType;
	private String deptName;
	private String deptSname;
	private String upDeptCode;
	private String kostl;
	private String saleDiv;
	private String useYesno;
	private String sortOrder;
	private String procName;
	private String code;
	private String label;
}
