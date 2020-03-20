package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findDuct")
@Data
public class FindDuct implements Serializable{

	private static final long serialVersionUID = 4506115807093552611L;

	private String fittings;
	private String fittingsName;
	private String productType;
	private String productTag;
	private String l1Tag;
	private String w1Tag;
	private String w2Tag;
	private String w3Tag;
	private String w4Tag;
	private String d1Tag;
	private String d2Tag;
	private String d3Tag;
	private String d4Tag;
	private String r1Tag;
	private String r2Tag;
	private String s1Tag;
	private String s2Tag;
	private String s3Tag;
	private String s4Tag;
	private String pTag;
	private String hTag;
	private String horizonTag;
	private String fittingsStd;
	private String fittingsUnit;
	private String cornerQty;
	private String remarks;
	private String fileName;
	private String fileType;
	private String filePath;
	private String areaFormula;
	private String itemCode;
	
}
