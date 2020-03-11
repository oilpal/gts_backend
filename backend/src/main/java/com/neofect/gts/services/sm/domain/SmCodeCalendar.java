package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("smCodeCalendark")
@Data
public class SmCodeCalendar implements Serializable {

	private static final long serialVersionUID = -5457456205407204870L;

	private String holyDate; 
	private String moonTag; 
	private String holyName; 
	private String preDays; 
	private String nextDays; 
	private String remark;
	private String companyCode; 
	private String holyYear; 
	private String holyDay; 
	
}
