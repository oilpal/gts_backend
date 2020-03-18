package com.neofect.gts.config.security.jwt;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("jwtResponse")
@Data
public class JwtResponse {

	public JwtResponse(String jwt, Long id, String username, String email) {
		this.token = jwt;
		this.id = id;
		this.username = username;
		this.email = email;
	}
	
	private String token;
	private String type;
	private Long id;
	private String username;
	private String email;
	
}
