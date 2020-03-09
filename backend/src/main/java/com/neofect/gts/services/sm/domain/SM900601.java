package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM900601")
@Data
public class SM900601 implements Serializable {
	
	private static final long serialVersionUID = 7556755516361120379L;

	private String sysId;
	private String pgmCode;
	private String gridId;
	private String fieldname;
	private String seq;
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
}
