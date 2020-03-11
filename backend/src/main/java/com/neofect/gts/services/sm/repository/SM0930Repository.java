package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM0930;

/**
 * SM0930Repository
 * @author cm
 *
 */
public interface SM0930Repository {
	  
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM0930> SM0930_01(Map<String, Object> param);
   
   /**
    * 
    * @param param
    * @return
    */ 
   List<SM0930> SM0930_02(Map<String, Object> param);
    
}
