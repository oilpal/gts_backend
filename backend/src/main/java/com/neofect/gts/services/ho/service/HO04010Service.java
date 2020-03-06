package com.neofect.gts.services.ho.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.ho.domain.HO04010;
import com.neofect.gts.services.ho.repository.HO04010Repository;

/**
 * 공지사항 등록 관리
 * @author cm
 *
 */
@Service
public class HO04010Service {

	@Autowired
	HO04010Repository ho04010Repository;

	/**
	 * 공지사항 등록 리스트
	 * @param param
	 * @return
	 */

	public List<HO04010> getNoticeMList(Map<String, Object> param) {
		return ho04010Repository.getNoticeMList(param);
	}

}
