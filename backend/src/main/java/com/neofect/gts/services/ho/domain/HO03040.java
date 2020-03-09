package com.neofect.gts.services.ho.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("HO03040")
@Data
public class HO03040 implements Serializable{

	private static final long serialVersionUID = -6249432343196543810L;

	private String memberId;
	private String name;
	private String gubunDiv;
	private String deptId;
	private String deptName;
	private String memberDiv;
	private String workYn;
	private String printSeq;
	
}
