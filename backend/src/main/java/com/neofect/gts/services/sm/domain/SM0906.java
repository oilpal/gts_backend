package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM0906")
@Data
public class SM0906 implements Serializable {
	
	private static final long serialVersionUID = 1897682785672964532L;
	
	private String compcode;
	private String userDiv;
	private String custCode;
	private String custName;
	private String empname;
	private String loginid;
	private String groupId;
	private String password2;
	private String password;
	private String usingtag;
	private String telnumber;
	private String mobile;
	private String email;
	private String messengerDiv;
	private String jikGub;
	private String pageTag;
	private String ipAddr;
	private String userId;
	private String code;
	private String label;
	private String companyCode;
	private String userName;
	private String userDesc;
	private String userPassword;
	private String useYn;
	private String userTag;
	private String deptCode;
	private String deptName;
	private String vendorCode;
	private String vendorName;
	private String mobileNo;
	private String loginCount;
	private String loginLockYesno;
	private String loginTime;
	private String logoutTime;
	private String inspectCenter;
	private String user;
	private String search;
}
