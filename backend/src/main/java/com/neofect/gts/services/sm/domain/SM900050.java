package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM900050")
@Data
public class SM900050 implements Serializable {
	
	private static final long serialVersionUID = -2141475415018411545L;
	
	private String companyCode;
	private String sysId;
	private String sortCode;
	private String pgmCode;
	private String pgmName;
	private String existsDb;
	private String selected;
	private String impJs;
	private String impXmlx;
	private String impGrid;
	private String importMessage;
	private String updateType;
	private String updatable;
	private String updateIskey;
	private String gridId;
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
	private String sqlFile;
	private String sqlId;
	private String updateTable;
}
