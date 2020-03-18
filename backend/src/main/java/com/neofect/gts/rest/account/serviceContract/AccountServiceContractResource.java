package com.neofect.gts.rest.account.serviceContract;

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

import com.neofect.gts.services.account.info.domain.AccountInfo;
import com.neofect.gts.services.account.serviceContract.domain.AccountServiceContract;
import com.neofect.gts.services.account.serviceContract.service.AccountServiceContractService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="*")
@RestController
@Api(value = "AccountServiceContractResource")
@RequestMapping("/api/accountServiceContract")
public class AccountServiceContractResource {

	@Autowired 
	AccountServiceContractService accountServiceContractService;
	
	/**
	 * 대상자 검색
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiImplicitParams({
		@ApiImplicitParam(name = "deptId", value = "", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "custId", value = "", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "startDate", value = "", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "endDate", value = "", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@ApiOperation(value = "대상자 검색" ,notes = "대상자 검색")
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AccountServiceContract>> selectServiceContractList(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        List<AccountServiceContract> result = accountServiceContractService.GS01020_R01(q);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 계약 히스토리 검색
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiImplicitParams({
		@ApiImplicitParam(name = "custId", value = "", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@ApiOperation(value = "계약 히스토리 검색" ,notes = "계약 히스토리 검색")
	@GetMapping(value = "/historyList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AccountServiceContract>> selectServiceContractHistoryList(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        List<AccountServiceContract> result = accountServiceContractService.GS01020_C02(q);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
}
