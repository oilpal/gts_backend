package com.neofect.gts.services.common.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("popUp")
@Data
public class PopUp implements Serializable{

	private static final long serialVersionUID = -440727919903976816L;

	private String boardid;
	private String boardtitle;
	private String wdate;
	private String writer;
	private String boardcontents;
	private String atchFileId;
	private String fileSn;
	private String orignlFileNm;
	private String popupId;
	private String fileUrl;
	private String bbsId;
	private String nttId;
	private String popupWidthSize;
	private String popupVrticlSize;
	private String popupWidthLc;
	private String popupVrticlLc;
	private String stopvewSetupAt;

}
