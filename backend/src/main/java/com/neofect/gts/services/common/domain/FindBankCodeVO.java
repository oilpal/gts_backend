package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findBankCode")
@Data
public class FindBankCodeVO implements Serializable{

	private static final long serialVersionUID = 8951064507131111365L;

	private String bankCode;
	private String bankName;
	
}
