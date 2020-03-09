package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("sapWbsReqContamt")
@Data
public class SapWbsReqContamt implements Serializable {
	
	private static final long serialVersionUID = -2390631234853658261L;

	private String bussno;
	private String zvern;
	private String waers;
	private String zcgubun;
	private String prart;
	private String zcont;
	private String zcond;
	private String zcons;
	private String zcone;
	private String zcond2;
	private String zcons2;
	private String zcone2;
	private String sapdiv;
	private String reqdiv;
	private String rtnflag;
	private String rtnmsg;
	private String eaiStat;
	private String eaiMsg;
	
}
