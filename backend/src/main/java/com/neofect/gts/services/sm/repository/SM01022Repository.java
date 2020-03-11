package com.neofect.gts.services.sm.repository;

import java.util.List;
import java.util.Map;

import com.neofect.gts.services.sm.domain.SM01022;

/**
 * SM01022Repository
 * @author cm
 *
 */
public interface SM01022Repository {

	  /**
	    * 
	    * @param param
	    * @return
	    */ 
	List<SM01022> SM0102201(Map<String, Object> param);

	/**
	 * 
	 * @param param
	 * @return
	 */ 
	List<SM01022> RSM0102202(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */ 
	List<SM01022> RSM0102203(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */ 
	List<SM01022> RSM0102204(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */ 
	List<SM01022> RSM0102205(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */ 
	List<SM01022> RSM0102206(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */ 
	List<SM01022> RSM0102207(Map<String, Object> param);
	
	/**
	 * 
	 * @param param
	 * @return
	 */ 
	List<SM01022> CUSTDELECTLOG(Map<String, Object> param);

}
