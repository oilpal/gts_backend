package com.neofect.gts.services.ho.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("HO03050")
@Data
public class HO03050 implements Serializable{

	private static final long serialVersionUID = 6364744294219244887L;

	private String carefacilityDiv;
	private String applyDate;
	private String custLevelDiv;
	private String limitAmt;
	private String gPayamt;
	private String lPayamt;
	private String nPayamt;
	private String mPayamt;
	private String remark;
	private String useYn;
	
}
