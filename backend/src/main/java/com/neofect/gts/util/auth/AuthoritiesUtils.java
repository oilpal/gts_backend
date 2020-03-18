package com.neofect.gts.util.auth;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import com.neofect.gts.services.common.domain.LoginUser;

public final class AuthoritiesUtils {
	
	private static final List<GrantedAuthority> ADMIN_ROLES = AuthorityUtils.createAuthorityList("ROLE_ADMIN","ROLE_USER");
	private static final List<GrantedAuthority> USER_ROLES = AuthorityUtils.createAuthorityList("ROLE_USER");
		
	public static Collection<? extends GrantedAuthority> createAuthorities(LoginUser loginUser) {
		String username = loginUser.getUsername();
		if (username.startsWith("DEVELOPER")) {
			return ADMIN_ROLES;
		}
		return USER_ROLES;
	}
}