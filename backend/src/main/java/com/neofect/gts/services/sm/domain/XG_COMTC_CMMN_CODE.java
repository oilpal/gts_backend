package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("XG_COMTC_CMMN_CODE")
@Data
public class XG_COMTC_CMMN_CODE implements Serializable {

	private static final long serialVersionUID = 4359052909513194016L;
	
	private String codeId;
	private String codeIdNm;
	private String codeIdDc;
	private String useAt;
	private String clCode;
	private String find;
	private String code;
	private String codeNm;
	private String codeDc;
}
