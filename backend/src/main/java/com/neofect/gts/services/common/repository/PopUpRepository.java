package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.PopUp;

public interface PopUpRepository {

	/* 공지사항 리스트 */
	List<PopUp> BOARD_R01 (Map<String,Object> param);

	/* 공지사항 내용 */
	List<PopUp> BOARD_R02 (Map<String,Object> param);
	
	/* 공지사항 첨부파일 */
	List<PopUp> BOARD_R03 (Map<String,Object> param);
	
	/* popup */
	List<PopUp> popup (Map<String,Object> param);
	
	/* popup_detail */
	List<PopUp> popup_detail (Map<String,Object> param);
	
}
