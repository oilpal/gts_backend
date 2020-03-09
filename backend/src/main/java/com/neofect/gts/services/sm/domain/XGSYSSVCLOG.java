package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("XGSYSSVCLOG")
@Data
public class XGSYSSVCLOG implements Serializable {

	private static final long serialVersionUID = -6587710510355240876L;
	
	private String rqesterId;
	private String userName;
	private String accCount;
	private String companyCode;
	private String fromDate;
	private String toDate;
	private String user;
	private String sysName;
	private String sortOrder;
	private String pgmName;
	private String trgetMenuNm ;
	private String occrrncDe;
	private String methodNm;
	private String creatCo;
	private String updtCo;
	private String rdcnt;
	private String deleteCo;
}
