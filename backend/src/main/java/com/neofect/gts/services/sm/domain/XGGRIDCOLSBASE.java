package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("XGGRIDCOLSBASE")
@Data
public class XGGRIDCOLSBASE implements Serializable {

	private static final long serialVersionUID = -7633530978736951255L;
		
	private String sysId;
	private String fieldName;
	private String fieldNameKor;
	private String baseApply;
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
	private String renderer;
	private String filters;
	private String validations;
}
