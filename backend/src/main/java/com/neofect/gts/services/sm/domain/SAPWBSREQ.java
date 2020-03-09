package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("sapwbsreq")
@Data
public class SAPWBSREQ implements Serializable {
	
	private static final long serialVersionUID = 5669043378600079316L;
	
	private String sapdiv;
	private String reqdiv;
	private String bussno;
	private String pspid;
	private String posid;
	private String post1;
	private String post2;
	private String pjtyear;
	private String zdomo;
	private String zland1;
	private String zselo;
	private String akstl;
	private String akstlDept;
	private String akstlName;
	private String fkstl;
	private String fkstlDept;
	private String fkstlName;
	private String pspst;
	private String posstcd2;
	private String plfaz;
	private String plfazName;
	private String plsez;
	private String plsezName;
	private String bCodeSt;
	private String bCodeNm;
	private String msalesTp;
	private String vbukr;
	private String zinoo;
	private String zplco;
	private String zinho;
	private String zouto;
	private String pbYn;
	private String zgeno;
	private String mfiGbn;
	private String zcust;
	private String bizregno;
	private String zcustname;
	private String zarea;
	private String continent;
	private String zbido;
	private String msujuTp;
	private String zcomo;
	private String zcopo;
	private String zbexp;
	private String zcodt;
	private String dirId;
	private String dirName;
	private String pmId;
	private String pmName;
	private String cnstLocation;
	private String sujuAmt;
	private String vkbur;
	private String hajaRate;
	private String pjtTyp;
	private String mbizFid;
	private String zScope;
	private String rtnflag;
	private String rtnmsg;
	private String eaiStat;
	private String eaiMsg;
	private String zprocfin;
	private String zconx;
	private String zmino;
	private String zdano;
	private String zsucu;
	private String mconTp;
	private String zsyso;
	private String zfailres;
	private String zvernmax;
	private String mvendorCode;
	private String mvendorName;

	
}
