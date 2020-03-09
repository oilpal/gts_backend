package com.neofect.gts.services.gs.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("GS01030")
@Data
public class GS01030 implements Serializable {

	private static final long serialVersionUID = -3980598405288219905L;
	
	private String formSeq;
	private String custId;
	private String custName;
	private String custLevelDiv;
	private String custGubunDiv;
	private String manageNo;
	private String birthDate;
	private String phone;
	private String zipCode;
	private String addr1;
	private String addr2;
	private String deptId;
	private String deptName;
	private String deptDiv;
	private String ownerName;
	private String deptPhone;
	private String deptAddr;
	private String proName;
	private String relationDiv;
	private String proBirthDate;
	private String proPhone;
	private String proHp;
	private String proZipCode;
	private String proAddr1;
	private String proAddr2;
	private String fromDate;
	private String toDate;
	private String writeDay;
	private String calcDay;
	private String notiDay;
	private String payDay;
	private String payMethod;
	private String contractDate;
	private String writeDate;
	private String memberId;
	private String memberName;
	private String planSeq;
	private String monYn;
	private String tueYn;
	private String wedYn;
	private String thuYn;
	private String friYn;
	private String satYn;
	private String sunYn;
	private String fromHour;
	private String fromMin;
	private String toHour;
	private String toMin;
	private String weekYn;
	private String week2Yn;
	private String monthYn;
	private String address;
	private String hp;
}
