package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("sm01012")
@Data
public class SM01012 implements Serializable {

	private static final long serialVersionUID = -6657422929821832516L;

	private String comsecCode;
	private String comsecName;
	private String deptYn;
	private String userChgYn;
	private String columnNam;
	private String comdivCode;
	private String comdivName;
	private String inputYn;
	private String useYn;
	private String lmsTag;
	private String kind1;
	private String name1;
	private String kind2;
	private String name2;
	private String startDate;
	private String endDate;
	private String printSeq;
	private String remark;
}
