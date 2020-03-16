package com.neofect.gts.services.common.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.common.domain.Auth;

public interface AuthRepository {

	List<Auth> PgmAuth(Map<String, Object> param);
	
}
