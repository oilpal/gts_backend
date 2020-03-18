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

import com.neofect.gts.services.adjustment.chargeStatus.domain.AdjustmentChargeStatus;
import com.neofect.gts.services.adjustment.chargeStatus.service.AdjustmentChargeStatusService;
import com.neofect.gts.services.common.domain.Comm;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="*")
@RestController
@Api(value = "ChargeStatusResource")
@RequestMapping("/api/chargeStatus")
public class AdjustmentChargeStatusResource {

	@Autowired 
	AdjustmentChargeStatusService chargeStatusService;
	
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
    public ResponseEntity<List<AdjustmentChargeStatus>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        List<AdjustmentChargeStatus> list = chargeStatusService.GS01060_R01(q);

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
	public ResponseEntity<List<AdjustmentChargeStatus>> serviceDetail(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
		if (q == null) {
			q = new HashMap<String,Object>();
		}
		
		List<AdjustmentChargeStatus> list = chargeStatusService.GS01060_C02(q);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(list, headers, HttpStatus.OK);
	}

	/**
	 * 가산율 input
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "가산율 추가" ,notes = "이것은 가산율 추가를 진행한다.")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "deptId", value = "회사코드번호", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "yyyymm", value = "날짜", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "custId", value = "고객번호", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "useAmt", value = "이용료", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "moveAmt", value = "이동료", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "bathAmt", value = "목욕료", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "workAmt", value = "인력가산", required = true, dataType = "string", paramType = "query", defaultValue = ""),
	})
	@GetMapping(value = "/reqAmt", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> reqAmt(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
		if (q == null) {
			q = new HashMap<String,Object>();
		}
		
//		reqAmt (전) 공단 청구금 세분화된 이용료, 이동료, 목욕료, 인력가산을 합한 값을 저장 시킬 예정
		int reqAmt = chargeStatusService.updateAdditionRate(q);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(reqAmt, headers, HttpStatus.OK);
	}
}
