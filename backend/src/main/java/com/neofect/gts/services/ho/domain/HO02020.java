package com.neofect.gts.services.ho.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("HO02020")
@Data
public class HO02020 implements Serializable{

	private static final long serialVersionUID = -1446606837191012926L;

	private int fromamt;
	private int toamt;
	private int taxamt1;
	private int taxamt2;
	private int taxamt3;
	private int taxamt3_2;
	private int taxamt4;
	private int taxamt4_2;
	private int taxamt5;
	private int taxamt5_2;
	private int taxamt6;
	private int taxamt6_2;
	private int taxamt7;
	private int taxamt7_2;
	private int taxamt8;
	private int taxamt8_2;
	private int taxamt9;
	private int taxamt9_2;
	private int taxamt10;
	private int taxamt10_2;
	private int taxamt11;
	private int taxamt11_2;
	
	
}
