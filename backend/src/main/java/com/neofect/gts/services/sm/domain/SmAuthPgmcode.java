package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smAuthPgmcode")
@Data
public class SmAuthPgmcode implements Serializable {

	private static final long serialVersionUID = -518145596256476199L;
	
	private String companyCode;
	private String sysId;
	private String sortCode;
	private String pgmCode;
	private String pgmName;
	private String pgmUrl;
	private String showYesno;
	private String movebtnYesno;
	private String updateYesno;
	private String retrieveYesno;
	private String insertYesno;
	private String appendYesno;
	private String duplicateYesno;
	private String deleteYesno;
	private String printYesno;
	private String excelYesno;
	private String closeYesno;
	private String developedYesno;
	private String sortOrder;
	private String helpYesno;
	private String parentSortCode;
	private String menuLevel;
	private String pageLink;
	private String menuCode;
	private String menulevel;
	private String tempType;
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
	private String connUrl;
	private String openUrl;
	private String sysSortOrder;
	private String childMenuCnt;
	private String parentPgmName;
	private String sidepanelYn;
	private String pgmLevel;
	private String sysDiv;
	private String actName;
	
}
