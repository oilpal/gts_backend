package com.neofect.gts.services.sm.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SM0945")
@Data
public class SM0945 implements Serializable {
	
	private static final long serialVersionUID = -6382446577283170845L;
	
	private String max_seq;
	private String find;
	private String doc_seq;
	private String reg_date;
	private String user_id;
	private String user_name;
	private String company_code;
	private String dept_code;
	private String dept_name;
	private String pos_code;
	private String sys_id;
	private String pgm_path;
	private String pgm_code;
	private String pgm_name;
	private String use_i;
	private String use_r;
	private String main_content;
	private String status_tag;
	private String status_y;
	private String status_n;
}
