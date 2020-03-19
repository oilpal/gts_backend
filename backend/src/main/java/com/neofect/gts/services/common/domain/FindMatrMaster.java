package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findMatrMaster")
@Data
public class FindMatrMaster implements Serializable{

	private static final long serialVersionUID = -1888909528923013078L;

	private String itemName;
	private String itemStd;
	private String itemUnit;
	private String itemCode;
	private String upItemCode;
	private String upItemName;
	private String largeCode;
	private String middleCode;
	private String smallCode;
	private String acntCode;
	private String largeName;
	private String middleName;
	private String smallName;
	private String code;
	private String estUseTag;
	private String itemStd2;
	private String masterCost;
	private String orderCost;
	private String etcCost;
	private String remarks;
	private String stdTag;
	private String gubunTag;
	private String accGb;
	private String etcAtt1;
	private String etcAtt2;
	private String etcAtt3;
	private String tempcodeYn;
	private String newYn;
	private String acntName;
	private String calcModify;
	private String costModify;
	private String widthYn;
	private String heightYn;
	private String areaYn;
	private String diameterYn;
	private String width;
	private String height;
	private String area;
	private String diameter;
	private String itemName2;
	private String whaYn;
	private String itemMaker;
	private String makerName;
	
}
