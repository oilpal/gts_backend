package com.neofect.gts.services.common.domain;

import java.util.HashSet;
import java.util.Set;

import org.apache.ibatis.type.Alias;

import com.neofect.gts.config.security.Role;

import lombok.Data;
import lombok.ToString;

/**
 * 로그인 사용자 정보 
 * @author jd
 *
 */
@Alias("loginUser")
@Data
@ToString
public class LoginUser {
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
	
}
