package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("auth")
@Data
public class Auth implements Serializable{
	
	private static final long serialVersionUID = -6431246860682449760L;

	private String authYn;
	
}
