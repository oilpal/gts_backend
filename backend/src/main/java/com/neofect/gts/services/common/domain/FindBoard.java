package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("findBoard")
@Data
public class FindBoard implements Serializable{

	private static final long serialVersionUID = -5245066080547116817L;

	private String boardgb;
	private String boardid;
	private String siteDiv;
	private String boardtitle;
	private String wdate;
	private String writer;
	private String writerId;
	private String popupYn;
	private String sdate;
	private String edate;
	private String boardcontents;
	private String atchFileId;
	private String fileSn;
	private String orignlFileNm;
	private String fileSize;
	
}
