package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("XG_GRID")
@Data
public class XG_GRID implements Serializable {
	
	private static final long serialVersionUID = -7704147543386354599L;
	
	private String sysId;
	private String pgmCode;
	private String gridId;
	private String sqlId;
	private String panelVisible;
	private String footerVisible;
	private String checkbarVisible;
	private String statesbarVisible;
	private String selectStyle;
	private String insertable;
	private String appendable;
	private String updatable;
	private String deletable;
	private String deleteRowsConfirm;
	private String baseApplyYn;
	private String baseApply;
	private String fieldSeq;
	private String fieldName;
	private String fieldNameKor;
	private String dataType;
	private String width;
	private String mustInput;
	private String defaultValue;
	private String tag;
	private String visible;
	private String readonly;
	private String editable;
	private String sortable;
	private String button;
	private String imageList;
	private String header;
	private String footer;
	private String styles;
	private String dynamicStyles;
	private String editor;
	private String lookupdisplay;
	private String renderer;
	private String filters;
	private String validations;
}
