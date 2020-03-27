package com.neofect.gts.rest.accounthing.payment;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neofect.gts.services.accounthing.payment.domain.AccounthingPayment;
import com.neofect.gts.services.accounthing.payment.service.AccounthingPaymentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="*")
@RestController
@Api(value = "AccounthingPaymentCollectResource")
@RequestMapping("/api/acct/pay")
public class AccounthingPaymentCollectResource {

	@Autowired 
	AccounthingPaymentService accounthingPaymentService;
	
	/**
	 * 미수금현황
	 * @param q
	 * @param AccounthingPayment
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "미수금 현황" ,notes = "이것은 미수금 현황을 불러온다.")
	@ApiImplicitParams({
        @ApiImplicitParam(name = "deptId", value = "회사코드번호", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "yyyymm", value = "집계년월", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "custCode", value = "주민 / 사업자번호 or 거래처명칭", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "reductionDiv", value = "급여종류", required = true, dataType = "string", paramType = "query", defaultValue = ""),
   })
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AccounthingPayment>> CurrentAccountsReceivable(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        List<AccounthingPayment> list = accounthingPaymentService.getCARList(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(list, headers, HttpStatus.OK);
    }
	
	/**
	 * 월별정산내역
	 * @param q
	 * @param AccounthingPayment
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "월별정산내역" ,notes = "이것은 월별정산내역을 불러온다.")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "deptId", value = "회사코드번호", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "yyyymm", value = "집계년월", required = true, dataType = "string", paramType = "query", defaultValue = ""),
	})
	@GetMapping(value = "/listDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AccounthingPayment>> MonthlySettlementHistory(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
		if (q == null) {
			q = new HashMap<String,Object>();
		}
		
		List<AccounthingPayment> list = accounthingPaymentService.getMSHList(q);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(list, headers, HttpStatus.OK);
	}

	/**
	 * 입급내역
	 * @param q
	 * @param AccounthingPayment
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "입급내역" ,notes = "이것은 입급내역을 불러온다.")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "deptId", value = "회사코드번호", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
	})
	@GetMapping(value = "/payDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AccounthingPayment>> DepositHistory(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
		if (q == null) {
			q = new HashMap<String,Object>();
		}
		
		List<AccounthingPayment> list = accounthingPaymentService.getDHList(q);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(list, headers, HttpStatus.OK);
	}
	
	/**
	 * 급여비용명세서엑셀
	 * @param q
	 * @param AccounthingPayment
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "급여비용명세서엑셀" ,notes = "이것은 급여 비용 명세서 엑셀을 불러온다.")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "deptId", value = "회사코드번호", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "yyyymm", value = "월일", required = true, dataType = "string", paramType = "query", defaultValue = ""),
	})
	@GetMapping(value = "/billExcel", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AccounthingPayment>> SalaryExpenseStatement(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
		if (q == null) {
			q = new HashMap<String,Object>();
		}
		
		List<AccounthingPayment> list = accounthingPaymentService.getSESList(q);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(list, headers, HttpStatus.OK);
	}

	
}
