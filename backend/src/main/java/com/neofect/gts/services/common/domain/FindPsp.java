package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findPsp")
@Data
public class FindPsp implements Serializable{

	private static final long serialVersionUID = 3132694338613391586L;

	private String fittings;               
	private String fittingsName;          
	private String productType;           
	private String l1Tag;                 
	private String l2Tag;                 
	private String l3Tag;                 
	private String l4Tag;                 
	private String l5Tag;                 
	private String d1Tag;                 
	private String d2Tag;                 
	private String d3Tag;                 
	private String r1Tag;                 
	private String r2Tag;                 
	private String j1Tag;                 
	private String j2Tag;                 
	private String j3Tag;                 
	private String productTag;            
	private String cTag;                  
	private String fittingsStd;           
	private String fittingsUnit;          
	private String itemCode;              
	private String realItemCode;         
	private String cornerQty;             
	private String holeQty;               
	private String remarks;                
	private String unitKg;                
	private String fileName;              
	private String fileType;              
	private String filePath;              
	private String areaFormula;           
	private String areaFormulaDesc;  
	private String inchTag;
	
}
