package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("sbManual")
@Data
public class SbManual implements Serializable {
	
	private static final long serialVersionUID = 4961366808998745484L;
	
	private String manualYn;
	
}
