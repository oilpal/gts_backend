package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM0915;

/**
 * SM0915Repository
 * @author cm
 *
 */
public interface SM0915Repository {
	  
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM0915> SM0915_01(Map<String, Object> param);
   
   /**
    * 
    * @param param
    * @return
    */ 
   List<SM0915> SM0915_02(Map<String, Object> param);
       
}
