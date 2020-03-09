package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smcomcode")
@Data
public class SMCOMCODE implements Serializable {

	private static final long serialVersionUID = -4894689230020449470L;
	
	private String sysId;
	private String hcode;
	private String hname;
	private String floatPos;
	private String remar;
	private String useYesno;
	private String dcode;
	private String dname;
	private String dvalue;
	private String relateCode1;
	private String relateCode2;
	private String relateCode3;
	private String relateCode4;
	private String relateCode5;
	private String dvalue1;
	private String dvalue2;
	private String dvalue3;
	private String dvalue4;
	private String dvalue5;
	private String dname1;
	private String dname2;
	private String dname3;
	private String dname4;
	private String dname5;
	private String fixCode1;
	private String fixCode2;
	private String fixCode3;
	private String fixCode4;
	private String fixCode5;
	private String rmk;
	private String code;
	private String label;
	private String sysName;
	private String useYn;
}
