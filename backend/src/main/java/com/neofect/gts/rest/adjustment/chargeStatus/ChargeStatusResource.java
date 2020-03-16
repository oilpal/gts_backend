package com.neofect.gts.rest.adjustment.chargeStatus;

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

import com.neofect.gts.services.adjustment.chargeStatus.service.ChargeStatusService;
import com.neofect.gts.services.common.domain.Comm;
import com.neofect.gts.services.gs.domain.ChargeStatus;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="*")
@RestController
@Api(value = "ChargeStatusResource")
@RequestMapping("/api/chargeStatus")
public class ChargeStatusResource {

	@Autowired 
	ChargeStatusService chargeStatusService;
	
	/**
	 * 고객 청구현황 목록
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "고객 청구현황" ,notes = "이것은 고객 청구현황을 불러온다.")
	@ApiImplicitParams({
        @ApiImplicitParam(name = "deptId", value = "회사코드번호", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "yyyymm", value = "날짜", required = true, dataType = "string", paramType = "query", defaultValue = ""),
   })
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ChargeStatus>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        List<ChargeStatus> list = chargeStatusService.GS01060_R01(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(list, headers, HttpStatus.OK);
    }

	/**
	 * 서비스 내역
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "서비스 내역" ,notes = "이것은 서비스 내역을 불러온다.")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "deptID", value = "회사코드번호", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "yyyymm", value = "날짜", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "custId", value = "고객번호", required = true, dataType = "string", paramType = "query", defaultValue = ""),
	})
	@GetMapping(value = "/detail", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ChargeStatus>> serviceDetail(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
		if (q == null) {
			q = new HashMap<String,Object>();
		}
		
		List<ChargeStatus> list = chargeStatusService.GS01060_C02(q);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(list, headers, HttpStatus.OK);
	}

	/**
	 * SysData_Ora
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "엑셀 다운로드?" ,notes = "이것은 엑셀 다운로드를 불러온다.")
	@GetMapping(value = "/excelDown", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Comm>> excelDown(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
		if (q == null) {
			q = new HashMap<String,Object>();
		}
		
		List<Comm> list = chargeStatusService.SysDataOra(q);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(list, headers, HttpStatus.OK);
	}
}
