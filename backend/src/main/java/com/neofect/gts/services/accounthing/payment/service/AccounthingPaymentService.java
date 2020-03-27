package com.neofect.gts.services.accounthing.payment.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neofect.gts.services.accounthing.payment.domain.AccounthingPayment;
import com.neofect.gts.services.accounthing.payment.repository.AccounthingPaymentRepository;

/**
 * 본인 부담금 수금
 * @author ccm
 *
 */
@Service
public class AccounthingPaymentService {

	@Autowired
	AccounthingPaymentRepository accounthingPaymentRepository;

	
	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<AccounthingPayment> getCARList(Map<String, Object> param) {
		return accounthingPaymentRepository.getCARList(param);
	}


	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<AccounthingPayment> getMSHList(Map<String, Object> param) {
		return accounthingPaymentRepository.getMSHList(param);
	}


	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<AccounthingPayment> getDHList(Map<String, Object> param) {
		return accounthingPaymentRepository.getDHList(param);
	}


	/**
	 * 
	 * @param param
	 * @return
	 */
	public List<AccounthingPayment> getSESList(Map<String, Object> param) {
		return accounthingPaymentRepository.getSESList(param);
	}


}
