package com.neofect.gts.config.security.jwt;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("jwtResponse")
@Data
public class JwtResponse {

	public JwtResponse(String jwt, Long id, String username, String email, List<String> roles, String status) {
		this.token = jwt;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles=roles;
		this.status = status;
	}
	
	private String token;
	private String type;
	private Long id;
	private String username;
	private String email;
	private List<String> roles;
	private String status;
	
}
