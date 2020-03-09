package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("XG_COMTN_BBS_USE")
@Data
public class XG_COMTN_BBS_USE implements Serializable {
	
	private static final long serialVersionUID = 4097557774296587551L;

	private String companyCode;
	private String bbsId;
	private String bbsNm;
	private String trgetId;
	private String registSeCode;
	private String registSeCodeNm;
	private String useAt;
	private String frstRegisterId;
	private String frstRegistPnttm;
	private String cmmntyId;
	private String cmmntyNm;
	private String clbId;
	private String clbNm;
	private String bbsTyCode;
	private String userId;
	private String userName;
}
