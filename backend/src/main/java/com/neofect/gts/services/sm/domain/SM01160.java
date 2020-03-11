package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM01160")
@Data
public class SM01160 implements Serializable {
	
	private static final long serialVersionUID = -255017575786033471L;

	private String sysIdM;
	private String pgmCodeM;
	private String menuCode;
	private String menuName;
	private String lev;
	private String companyCode;
	private String sysId;
	private String pgmCode;
	private String menuContent;
	private String menuPath;
	private String menuOrder;
	private String fileName;
	private String fileType;
	private String filePath;
	private String fileId;
	private String div;
	private String sortCode;
	private String rowInputDate;
	private String rowInputEmpNo;
	private String rowInputIp;
	private String maxSeq;
	private String menuTag;
	private String code;
	private String label;
	private String menuSeq;
	private String menuTitle;
	private String sortOrder;
}
