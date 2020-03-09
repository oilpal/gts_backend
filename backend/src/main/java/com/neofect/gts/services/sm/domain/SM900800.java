package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM900800")
@Data
public class SM900800 implements Serializable {
	
	private static final long serialVersionUID = -5601030512073033247L;
	
	private String companyCode;
	private String sysId;
	private String sysName;
	private String useYesno;
	private String sortOrder;
	private String label;
	private String value;
	private String showCnt;
	private String retrieveCnt;
	private String insertCnt;
	private String deleteCnt;
	private String excelCnt;
}
