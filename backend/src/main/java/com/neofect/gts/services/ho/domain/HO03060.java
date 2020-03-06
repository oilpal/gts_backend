package com.neofect.gts.services.ho.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("HO03060")
@Data
public class HO03060 implements Serializable{

	private static final long serialVersionUID = 588117028111446581L;

	private String yyyymm;
	private String deptId;
	private String deptName;
	private String deptGongclosedate;
	private String deptGongcloseyn;
	private String gongcloseyn;
	private String deptServiceclosedate;
	private String deptServicecloseyn;
	private String servicecloseyn;
	private String deptPayclosedate;
	private String deptPaycloseyn;
	private String paycloseyn;
	private String deptSpecialclosedate;
	private String deptSpecialcloseyn;
	private String specialcloseyn;
	private String deptAcntclosedate;
	private String deptAcntcloseyn;
	private String acntcloseyn;
	private String deptSellclosedate;
	private String deptSellcloseyn;
	private String sellcloseyn;
	
}
