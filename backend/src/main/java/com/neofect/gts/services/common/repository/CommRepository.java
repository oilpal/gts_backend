package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.Comm;

public interface CommRepository {

	List<Comm> SysDataOra(Map<String, Object> param);

	List<Comm> SysDateMss(Map<String, Object> param);

	List<Comm> ButtonAuth(Map<String, Object> param);

	List<Comm> FileNum(Map<String, Object> param);

	List<Comm> EXCELUPLOADCNT(Map<String, Object> param);

}
