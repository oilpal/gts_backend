package com.neofect.gts.services.ho.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("HO03020")
@Data
public class HO03020 implements Serializable{


	private static final long serialVersionUID = 2268811273056309287L;
	
	private String deptId;
	private String deptName;
	private String operDiv;
	private String serviceCode;
	private String useYn;
	private String zipCode;
	private String addr1;
	private String addr2;
	private String phone;
	private String fax;
	private String ownerName;
	private String ownerHp;
	private String managerName;
	private String managerHp;
	private String bizNo;
	private String bizName;
	private String bizUptae;
	private String bizUpjong;
	private String bizAddr1;
	private String bizAddr2;
	private String rentBamt;
	private String remtMamt;
	private String operAmt;
	private String proxyDeptid;
	private String proxyDeptname;
	private String salecenterYn;
	private String upperDeptid;
	private String upperDeptname;
	private String salecenterMain;
	private String chargeMan;
	private String chargeTel;
	private String chargeFax;
	private String payCalcDiv;
	private String depositno;
	private String bankDiv;
	private String branchName;
	private String depositDiv;
	private String cardChargerate;
	private String firstRamt;
	private String nowRamt;
	private String memberId;
	private String name;
	private String printSeq;
	
}
