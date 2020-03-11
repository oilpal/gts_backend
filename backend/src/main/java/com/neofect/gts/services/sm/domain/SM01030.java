package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("sm01030")
@Data
public class SM01030 implements Serializable {

	private static final long serialVersionUID = -8770308739729104369L;

	private String companyCode;								      	        
	private String vendorNo;										                
	private String vendorName;									                
	private String companyName;								                
	private String representName;							                
	private String representRrn;				
	private String bizStatus;					
	private String bizType;						
	private String phone;								
	private String zipCode;						
	private String addr1;								
	private String addr2;								
	private String firstSDate;				
	private String amStartMonth;			
	private String amSDate;						
	private String amEDate;						
	private String useYn;										                
	private String slipEvidCntYn;							            
	private String taxEvidIssueYn;							          
	private String bdgtResultYn;								            
	private String hrUseYn;										              
	private String slipPrintName;			
	private String chiAddr;						
	private String chiName;						
	private String chiRepresent;				
	private String projectYesno;									            
	private String groupDiv;						
	private String inputDutyId;				
	private String inputDate;					
	private String chgDutyId;					
	private String chgDate;						
	private String legalNo;						
	private String companyCode2;				
	private String groupOrder;					
	private String compOrder;					
	private String outsourceYn;									            
	private String compEname;					
	private String representEname;			
	private String addr1Eng;						
	private String addr2Eng;						
	private String generalAcntUseYn;						            
	private String siteAddr;						
	private String creditcardVatYn;					            
	private String projectCostYn;							            
	private String generalTaxType;		
}
