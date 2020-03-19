package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.FindBoard;

public interface FindBoardRepository {

	List<FindBoard> FindBoard (Map<String,Object> param);

	List<FindBoard> FindBoard_File (Map<String,Object> param);

	List<FindBoard> GET_NEXT_ID (Map<String,Object> param);

	List<FindBoard> SM_BOARD_U01 (Map<String,Object> param);
	
}
