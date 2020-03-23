package com.neofect.gts.services.center.errorCheck.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("errorCheck")
@Data
public class ErrorCheck implements Serializable{

	private static final long serialVersionUID = 6472944538085360956L;
	
	private String deptId;
	private String deptName;
	private String memberId;
	private String name;
	private int custId;
	private String custName;
	private int okCnt;
	private int errCnt;
	private int totalCnt;
	private String planDate;
	private String contSdate;
	private String contEdate;
	private String careSdate;
	private String careEdate;
	private String cancelDate;
	private String svcTime;
	private int productId;
	private String productName;
}
