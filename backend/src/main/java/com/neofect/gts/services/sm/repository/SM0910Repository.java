package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM0910;

/**
 * SM0910Repository
 * @author cm
 *
 */
public interface SM0910Repository {
	  
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM0910> SM0910_01(Map<String, Object> param);
   
   /**
    * 
    * @param param
    * @return
    */ 
   List<SM0910> SM0910_02(Map<String, Object> param);
   
   /**
    * 
    * @param param
    * @return
    */ 
   List<SM0910> SM0910_03(Map<String, Object> param);
}
