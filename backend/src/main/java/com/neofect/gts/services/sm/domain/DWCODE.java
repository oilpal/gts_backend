package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("dwCode")
@Data
public class DWCODE implements Serializable {

	private static final long serialVersionUID = -214382790760207181L;

	private String cod;
	private String codNm;
	private String kind;
	private String kindNm;
	private String kind2;
	private String kindNm2;
	
}
