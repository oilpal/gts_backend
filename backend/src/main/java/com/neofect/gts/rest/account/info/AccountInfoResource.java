package com.neofect.gts.rest.account.info;

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
import com.neofect.gts.services.account.info.service.AccountInfoService;
import com.neofect.gts.services.common.domain.Code;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="*")
@RestController
@Api(value = "AccountInfoResource")
@RequestMapping("/api/accountInfo")
public class AccountInfoResource {

	@Autowired 
	AccountInfoService accountInfoService;
	
	/**
	 * 고객정보 검색
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiImplicitParams({
		@ApiImplicitParam(name = "custId", value = "", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "custCode", value = "", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "deptId", value = "", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "alldate", value = "", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "startDate", value = "", required = true, dataType = "string", paramType = "query", defaultValue = ""),		
		@ApiImplicitParam(name = "endDate", value = "", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "contDeptDiv", value = "", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@ApiOperation(value = "고객정보 검색" ,notes = "고객정보 검색")
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AccountInfo>> selectAccountInfoList(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        List<AccountInfo> result = accountInfoService.GS01010_C01(q);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 담당센터정보
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiImplicitParams({
		@ApiImplicitParam(name = "custId", value = "", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@ApiOperation(value = "담당센터정보" ,notes = "담당센터정보")
	@GetMapping(value = "/deptInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AccountInfo>> selectDeptInfoList(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        List<AccountInfo> result = accountInfoService.GS01010_U02(q);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 고객정보 삭제
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiImplicitParams({
		@ApiImplicitParam(name = "deptId", value = "지사ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@ApiOperation(value = "고객정보 삭제" ,notes = "고객정보 삭제")
	@GetMapping(value = "/delCustInDept", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> deleteCustInDept(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        int result = accountInfoService.DEL_CODE_CUSTINDEPT(q);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 중복확인(센터 내)
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiImplicitParams({
		@ApiImplicitParam(name = "deptId", value = "지사ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "custName", value = "지사ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "birthDate", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@ApiOperation(value = "중복확인" ,notes = "중복확인")
	@GetMapping(value = "/chkCustInDept", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AccountInfo>> selectChkCustInDept(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        List<AccountInfo> result = accountInfoService.CHK_CODE_CUST(q);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 중복확인(타 센터)
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiImplicitParams({
		@ApiImplicitParam(name = "custName", value = "지사ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "birthDate", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@ApiOperation(value = "" ,notes = "")
	@GetMapping(value = "/chkCustOutDept", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AccountInfo>> selectChkCustOutDept(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        List<AccountInfo> result = accountInfoService.CODE_CUST_R01(q);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
}
