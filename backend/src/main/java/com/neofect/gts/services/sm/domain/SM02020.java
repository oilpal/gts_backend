package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM02020")
@Data
public class SM02020 implements Serializable {
	
	private static final long serialVersionUID = 6596797003524800235L;
	
	private String workDate;
	private String saturdayYn;
	private String sundayYn;
	private String holidayYn;
	private String holidayName;
	private String workYn;
	private String remark;
	private String yyyy;
}
