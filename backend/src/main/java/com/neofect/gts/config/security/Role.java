package com.neofect.gts.config.security;

import lombok.Data;

@Data
public class Role {

	private Integer id;
	private ERole name;

	public Role() {

	}
}
