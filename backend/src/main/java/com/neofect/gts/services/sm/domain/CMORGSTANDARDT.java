package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("cmmagamjecdt")
@Data
public class CMORGSTANDARDT implements Serializable {

	private static final long serialVersionUID = -7026837319434937301L;

	private String areaCd;
	private String magamjeCd;
	private String jobComment;
	private String jugi;
	private String jugiDan;
	private String jobCnt;
	private String jobType;
	private String masterCd;
	
}