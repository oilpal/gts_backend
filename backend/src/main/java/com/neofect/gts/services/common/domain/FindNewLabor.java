package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findNewLabor")
@Data
public class FindNewLabor implements Serializable{

	private static final long serialVersionUID = -4033625621184953631L;

	private String installPlace;
	private String cuId;
	private String cardNo;
	private String ioDate;
	private String photoUrl;
	private String projCode;
	
}
