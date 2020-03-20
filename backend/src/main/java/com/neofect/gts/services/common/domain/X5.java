package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("X5")
@Data
public class X5 implements Serializable{

	private static final long serialVersionUID = 4771223895816530535L;
	
	private String sysId;
	private String pgmCode;
	private String gridId;
	private String sqlFile;
	private String sqlId;
	private String updateTable;
	private String clobGridScript;
	private String seq;
	private String fieldSeq;
	private String fieldname;
	private String tableName;
	private String width;
	private String mustInput;
	private String visible;
	private String readonly;
	private String editable;
	private String sortable;
	private String header;
	private String headerText;
	private String styles;
	private String editor;
	private String lookupdisplay;
	private String renderer;
	private String button;
	private String alwaysshowbutton;
	private String headertooltip;
	private String merge;
	private String maxlength;
	private String footerexpr;
	private String footeralign;
	private String footerstyle;
	private String footerpre;
	private String footerpost;
	private String resizable;
	private String updateType;
	private String updatable;
	private String updateIskey;
	
}
