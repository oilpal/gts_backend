package com.neofect.gts.services.ho.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.ho.domain.HO04010;

/**
 * 공지사항 등록 관리 Repository
 * @author cm
 *
 */
public interface HO04010Repository {

	/**
	 * 공지사항 등록 리스트
	 * HO04010_R01
	 * comp, frdt, todt, div, find 필요 
	 * @param param
	 * @return
	 */
	List<HO04010> getNoticeMList(Map<String, Object> param);

}
