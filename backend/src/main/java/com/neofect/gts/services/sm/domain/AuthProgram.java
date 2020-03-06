package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("authProgram")
@Data
public class AuthProgram implements Serializable {

	private static final long serialVersionUID = -6631814961213417847L;
	
	private String asysId;
	private String pgmCode;
	private String pgmName;
	private String pgmUrl;
	private String showTag;
	private String moveBtnTag;
	private String updateTag;
	private String retrieveTag;
	private String insertTag;
	private String appendTag;
	private String duplicateTag;
	private String deleteTag;
	private String printTag;
	private String excelTag;
	private String closeTag;
	private String otherBtn;
	private String webTag;
	private String developedTag;
	private String criteria;
	private String remark;
	private String sortCode;
	private String sortOrder;
	private String helpTag;
	private String pageLink;
	private String pgmLevel;
	private String sysDiv;
	private String tempType;
	private String connUrl;
	private String endMenuYn;
	private String showYn;
	private String popupYn;
	private String multiYn;
	private String queryYn;
	private String appendYn;
	private String insertYn;
	private String deleteYn;
	private String updateYn;
	private String printYn;
	private String excelYn;
	private String insertAuth;
	private String deleteAuth;
	private String updateAuth;
	private String printAuth;
	private String excelAuth;
	
}
