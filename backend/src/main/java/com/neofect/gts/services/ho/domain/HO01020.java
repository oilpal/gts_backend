package com.neofect.gts.services.ho.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("HO01020")
@Data
public class HO01020 implements Serializable{

	private static final long serialVersionUID = 2639738703070428346L;
	
	private int productId;
	private String productDiv;
	private String productCode;
	private String productName;
	private int serviceMin;
	private int saleAmt;
	private int deptSaleAmt;
	private int introRate;
	private Date startDate;
	private Date endDate;
	private String useYn;
	private String unitDiv;
	private String roundYn;
	private String custLevelDiv;
	private String familyYn;
	private String prooffiDiv;
	private String psepDiv;
	private Date regDate;
	private int sortOrder;
	
	
}
