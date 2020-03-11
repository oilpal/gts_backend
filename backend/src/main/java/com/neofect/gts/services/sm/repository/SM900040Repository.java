package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM900040;

/**
 * SM900040Repository
 * @author cm
 *
 */
public interface SM900040Repository {
	  
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM900040> DEV_PGM_CODE(Map<String, Object> param);
    
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM900040> S_GRID_COLS(Map<String, Object> param);
    
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM900040> DEV_GRID_COLS(Map<String, Object> param);
    
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM900040> SM900002_GRIDSRC(Map<String, Object> param);
    
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM900040> DEV_GRID(Map<String, Object> param);
    
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM900040> DEV_GRID_UPDATE(Map<String, Object> param);
    
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM900040> DEV_COLUMN_LIST(Map<String, Object> param);
    
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM900040> PROC_SAVE(Map<String, Object> param);
    
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM900040> DEV_FREEFORM(Map<String, Object> param);	
}
