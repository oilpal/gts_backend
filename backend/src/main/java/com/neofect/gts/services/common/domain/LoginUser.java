package com.neofect.gts.services.common.domain;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.apache.ibatis.type.Alias;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.neofect.gts.config.security.Role;
import com.neofect.gts.util.auth.AuthoritiesUtils;

import lombok.Data;

/**
 * 로그인 사용자 정보 
 * @author jd
 *
 */
@Alias("loginUser")
@Data
public class LoginUser implements UserDetails{
	private Long id;
	private String username;
	private String password;
	private String email;
	
	/*부가정보*/
	private String userId;
	private String userPassword;
	private String useYn;
	private	String companyCode;
	private String companyName;
	private String deptCode;
	private String loginTime;
	private String logoutTime;
	private String ipAddr;
	private String loginCount;
	private String loginLockYesno;
	private String deptName;
	private String eMail;
	private String mobileNo;
	private String userTag;
	private String passwordUpdate;
	private String passwordExpire;
	private String encPassword;
	private String loginId;
	private String gradeCode;
	private String pageTag;
	
	private Set<Role> roles = new HashSet<>();
	
	public LoginUser() {
	}
	
	public LoginUser(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	private Collection<? extends GrantedAuthority> authorities;

	public LoginUser(Long id, String username, String email, String password,
			Collection<? extends GrantedAuthority> authorities) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.authorities = authorities;
	}

	public static LoginUser build(LoginUser user) {
		Collection<? extends GrantedAuthority> authorities = AuthoritiesUtils.createAuthorities(user);
		return new LoginUser(
				user.getId(), 
				user.getUsername(), 
				user.getEmail(),
				user.getPassword(), 
				authorities);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	
	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		LoginUser user = (LoginUser) o;
		return Objects.equals(id, user.id);
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
