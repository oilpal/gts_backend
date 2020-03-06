package com.neofect.gts.services.ho.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("HO04010")
@Data
public class HO04010 implements Serializable{

	private static final long serialVersionUID = -3098800254395632922L;

	private String boardgb;
	private String boardid;
	private String siteDiv;
	private String boardtitle;
	private String atchFileId;
	private String atchFileCnt;
	private String wdate;
	private String writer;
	private String popupYn;
	private String sdate;
	private String edate;
	private String boardcontents;
	
}
