package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findAddRqst")
@Data
public class FindAddRqst implements Serializable{

	private static final long serialVersionUID = -3334718647951902345L;
	
	private String companyCode;
	private String projectCode;
	private String projName;
	private String projRequestNo;
	private String requestYymm;
	private String requestNo;
	private String requestType;
	private String statusCode;
	private String requestDate;
	private String requestEmployee;
	private String requestRef;
	private String triggerTag;
	private String approvalDate;
	private String approvalEmployee;
	private String confirmDate;
	private String confirmEmployee;
	private String decisionDate;
	private String decisionEmployee;
	private String approvalTag;
	private String confirmTag;
	private String decisionTag;
	private String facmatYn;
	private String napprono;
	private String pstmatYn;
	private String pstCode;
	private String destination;
	private String recipientEmpno;
	private String constCode;
	private String custCode;
	private String custName;
	private String remarks;
	private String managerAcceptDate;
	private String managerAcceptEmpno;
	private String requestSeq;
	private String itemCode;
	private String itemName;
	private String itemStd;
	private String itemUnit;
	private String itemMaker;
	private String makerName;
	private String newTag;
	private String demandDate;
	private String requestQty;
	private String area;
	private String width;
	private String height;
	private String diameter;
	private String itemStd2;
	private String atchFileId;
	private String fileSn;
	private String orignlFileNm;
	private String contractQty;
	private String preRequestQty;
	private String rowid;
	private String productType;
	private String stateCode;
	private String requestPerson;
	private String personName;
	private String acceptDate;
	private String eptPerson;
	private String productTag;
	private String material;
	private String fittings;
	private String seq;
	private String thk;
	private String l1;
	private String ea;
	private String m2;
	private String itemQty;
	private String largeCode;
	private String middleCode;
	private String smallCode;
	private String largeName;
	private String middleName;
	private String smallName;
	private String code;
	private String estUseTag;
	private String upItemCode;
	private String masterCost;
	private String orderCost;
	private String etcCost;
	private String stdTag;
	private String gubunTag;
	private String accGb;
	private String etcAtt1;
	private String etcAtt2;
	private String etcAtt3;
	private String tempcodeYn;
	private String newYn;
	private String upItemName;
	private String acntCode;
	private String acntName;
	private String calcModify;
	private String costModify;
	private String diameterYn;
	private String itemName2;
	
}
