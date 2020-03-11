package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smCodeTaxoffice")
@Data
public class SmCodeTaxoffice implements Serializable {

	private static final long serialVersionUID = -2860848747855586137L;

	private String code;
	private String label;
}
