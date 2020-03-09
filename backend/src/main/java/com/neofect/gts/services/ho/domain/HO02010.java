package com.neofect.gts.services.ho.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("HO02010")
@Data
public class HO02010 implements Serializable{

	private static final long serialVersionUID = 7245828996037318895L;
	
	private int memberId;
	private int deptId;
	private String deptName;
	private int empNo;
	private Date inDate;
	private Date liinsurancedate;
	private String gubunDiv;
	private String workYn;
	private Date retireDate;
	private String handicapYn;
	private int hourPay;
	private int hourPay2;
	private int hourPay3;
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
