package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smAuthUserConfig")
@Data
public class SmAuthUserConfig implements Serializable {
	
	private static final long serialVersionUID = -1858139205711748247L;
	
	private String configLayout;
	
}
