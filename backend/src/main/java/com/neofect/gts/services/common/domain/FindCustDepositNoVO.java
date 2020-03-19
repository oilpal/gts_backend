package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findCustDepositNo")
@Data
public class FindCustDepositNoVO implements Serializable{

	private static final long serialVersionUID = -6497044421139901195L;

	private String custCode;
	private String depositSeq;
	private String bankCode;
	private String bankName;
	private String depositNo;
	private String depositOwner;
	private String depositChk;
	private String depositChkTitle;
	private String depositChkDate;
	private String remark;
	
}
