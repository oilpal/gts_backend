package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findCustCode")
@Data
public class FindCustCode implements Serializable {
	
	private static final long serialVersionUID = -6093209230010580253L;

	private String custCode;
	private String buyrCoprNm;
	private String owner;
	
}
