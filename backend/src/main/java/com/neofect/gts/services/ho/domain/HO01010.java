package com.neofect.gts.services.ho.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("HO01010")
@Data
public class HO01010 implements Serializable{

	private static final long serialVersionUID = 6472944538085360956L;
	
	private int deptId;
	private String deptName;
	private int memberId;
	private String name;
	private int custId;
	private String custName;
	private int okCnt;
	private int errCnt;
	private int totalCnt;
	private Date planDate;
	private Date contSdate;
	private Date contEdate;
	private Date careSdate;
	private Date careEdate;
	private Date cancelDate;
	private int svcTime;
	private int productId;
	private String productName;
}
