package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("XG_COMTN_LOGINLOG")
@Data
public class XG_COMTN_LOGINLOG implements Serializable {

	private static final long serialVersionUID = 3058530482141203614L;

	private String conectId;
	private String userName;
	private String accCount;
	private String companyCode;
	private String fromDate;
	private String toDate;
	private String user;
	private String logId;
	private String creatDt;
	private String conectIp;
	private String conectMthd;
}
