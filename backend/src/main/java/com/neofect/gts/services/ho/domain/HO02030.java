package com.neofect.gts.services.ho.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("HO02030")
@Data
public class HO02030 implements Serializable{

	private static final long serialVersionUID = 3366647665289703144L;

	private int memberId;
	private int deptId;
	private String deptName;
	private String name;
	private Date birthDt;
	private String gubunDiv;
	private Date inDate;
	private Date workYear;
	private String sel;
	private int hourPay;
	private int hourPay2;
	private int hourPay3;
	private int hourPay4;
	private String handicapLevel;
	private String workYn;
	private Date retireDate;
	private String handicapYn;
	private String payType;
	
}
