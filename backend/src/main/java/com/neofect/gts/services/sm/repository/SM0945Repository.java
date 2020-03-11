package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM0945;

/**
 * SM0945Repository
 * @author cm
 *
 */
public interface SM0945Repository {
	  
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM0945> SM0945_01(Map<String, Object> param);
    
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM0945> SM0945_R01(Map<String, Object> param);
    
}
