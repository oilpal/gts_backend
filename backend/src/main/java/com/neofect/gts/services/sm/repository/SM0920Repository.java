package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM0920;

/**
 * SM0920Repository
 * @author cm
 *
 */
public interface SM0920Repository {
	  
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM0920> SM0920_01(Map<String, Object> param);
   
   /**
    * 
    * @param param
    * @return
    */ 
   List<SM0920> SM0920_02(Map<String, Object> param);
   
   /**
    * 
    * @param param
    * @return
    */ 
   List<SM0920> SM0920_03(Map<String, Object> param);
    
}
