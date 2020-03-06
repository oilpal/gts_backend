package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("cmareacdt")
@Data
public class CMAREACDT implements Serializable {

	private static final long serialVersionUID = 6163219121931982539L;

	 private String CODE;
	 private String NAME;
	 private String USE_YN;
	
}
