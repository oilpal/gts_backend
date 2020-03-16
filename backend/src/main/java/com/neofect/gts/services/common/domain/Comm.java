package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("comm")
@Data
public class Comm implements Serializable{
	
	private static final long serialVersionUID = 2098254337795312362L;

	private String sysdate;
	private String pgmCode;
	private String pgmName;
	private String menulevel;
	private String sysDiv;
	private String menuorder;
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
	private String authI;
	private String authD;
	private String authP;
	private String authE;
	private String connUrl;
	private String aNum;
	private String cnt;
	
}
