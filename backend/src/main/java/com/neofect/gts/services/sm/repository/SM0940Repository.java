package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM0940;

/**
 * SM0940Repository
 * @author cm
 *
 */
public interface SM0940Repository {
	  
    /**
    * 
    * @param param
    * @return
    */ 
   List<SM0940> SM0940_01_TREE(Map<String, Object> param);
    
}
