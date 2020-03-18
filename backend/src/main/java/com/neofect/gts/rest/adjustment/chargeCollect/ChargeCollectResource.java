package com.neofect.gts.rest.adjustment.chargeCollect;

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

import com.neofect.gts.services.adjustment.chargeCollect.service.ChargeCollectService;
import com.neofect.gts.services.adjustment.chargeStatus.service.ChargeStatusService;
import com.neofect.gts.services.common.domain.Comm;
import com.neofect.gts.services.gs.domain.ChargeCollect;
import com.neofect.gts.services.gs.domain.ChargeStatus;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="*")
@RestController
@Api(value = "ChargeCollectResource")
@RequestMapping("/api/chargeCollect")
public class ChargeCollectResource {

	@Autowired 
	ChargeCollectService chargeCollectService;
	
	/**
	 * 미수금현황
	 * @param q
	 * @param ChargeCollect
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
	@GetMapping(value = "/carList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ChargeCollect>> CurrentAccountsReceivable(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        List<ChargeCollect> list = chargeCollectService.getCARList(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(list, headers, HttpStatus.OK);
    }
	
	/**
	 * 월별정산내역
	 * @param q
	 * @param ChargeCollect
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "월별정산내역" ,notes = "이것은 월별정산내역을 불러온다.")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "deptId", value = "회사코드번호", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "yyyymm", value = "집계년월", required = true, dataType = "string", paramType = "query", defaultValue = ""),
	})
	@GetMapping(value = "/mshList", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ChargeCollect>> MonthlySettlementHistory(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
		if (q == null) {
			q = new HashMap<String,Object>();
		}
		
		List<ChargeCollect> list = chargeCollectService.getMSHList(q);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(list, headers, HttpStatus.OK);
	}

	/**
	 * 입급내역
	 * @param q
	 * @param ChargeCollect
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "입급내역" ,notes = "이것은 입급내역을 불러온다.")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "deptId", value = "회사코드번호", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
	})
	@GetMapping(value = "/dhList", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ChargeCollect>> DepositHistory(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
		if (q == null) {
			q = new HashMap<String,Object>();
		}
		
		List<ChargeCollect> list = chargeCollectService.getDHList(q);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(list, headers, HttpStatus.OK);
	}
	
	/**
	 * 급여비용명세서엑셀
	 * @param q
	 * @param ChargeCollect
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "급여비용명세서엑셀" ,notes = "이것은 급여 비용 명세서 엑셀을 불러온다.")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "deptId", value = "회사코드번호", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "yyyymm", value = "월일", required = true, dataType = "string", paramType = "query", defaultValue = ""),
	})
	@GetMapping(value = "/sesList", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ChargeCollect>> SalaryExpenseStatement(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
		if (q == null) {
			q = new HashMap<String,Object>();
		}
		
		List<ChargeCollect> list = chargeCollectService.getSESList(q);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(list, headers, HttpStatus.OK);
	}

	
}
