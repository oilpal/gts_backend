package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smAuthGroupUsers")
@Data
public class SmAuthGroupUsers implements Serializable {
	
	private static final long serialVersionUID = 7802169075651866426L;

	private String companyCode;
	private String userGroupCode;
	private String userId;
	private String userName;
	private String remarks;
	private String userTag;
	private String userGroupName;

	
}
