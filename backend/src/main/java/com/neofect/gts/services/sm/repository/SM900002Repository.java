package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM900002;

/**
 * SM900002Repository
 * @author cm
 *
 */
public interface SM900002Repository {
	
	/**
	 * DEV_PGM_CODE
	 * pgmcode, sysId 필요
	 * @param param
	 * @return
	 */  
	List<SM900002> DEVPGMCODE(Map<String, Object> param);

	/**
	 * S_GRID_COLS
	 * pgmcode, sysId, sqlfile, sqlid 필요
	 * @param param
	 * @return
	 */  
	List<SM900002> SGRIDCOLS(Map<String, Object> param);
	
	/**
	 * DEV_GRID_COLS
	 * pgmcode, sysId, grid 필요
	 * @param param
	 * @return
	 */  
	List<SM900002> DEVGRIDCOLS(Map<String, Object> param);
	
	/**
	 * SM900002_GRIDSRC
	 * sys, pgmcode, cols 필요
	 * @param param
	 * @return
	 */  
	List<SM900002> SM900002GRIDSRC(Map<String, Object> param);

	/**
	 * DEV_GRID
	 * sys, pgmcode, cols 필요
	 * @param param
	 * @return
	 */  
	List<SM900002> DEVGRID(Map<String, Object> param);
	
	/**
	 * DEV_GRID_UPDATE
	 * sys, pgmcode, grid, sqlFile, sqlId, updTbl 필요
	 * @param param
	 * @return
	 */  
	List<SM900002> DEVGRIDUPDATE(Map<String, Object> param);

}
