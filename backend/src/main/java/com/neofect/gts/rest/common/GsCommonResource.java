package com.neofect.gts.rest.common;

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

import com.neofect.gts.services.common.domain.Code;
import com.neofect.gts.services.common.domain.GsCommon;
import com.neofect.gts.services.common.service.GsCommonService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="*")
@RestController
@Api(value = "GsCommonResource")
@RequestMapping("/api/gs/common")
public class GsCommonResource {

	@Autowired 
	GsCommonService gsCommonService;
	
	/**
	 * 최근 계약번호 가져오기
	 * @param q
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "최근 계약번호" ,notes = "최근 계약번호 가져오기")
	@ApiImplicitParams({
	    @ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "deptId", value = "지사ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "yymm", value = "년월", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@GetMapping(value = "/getMaxContSeq", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> selectMaxContSeq(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        int result = gsCommonService.GET_MAX_CONTSEQ(q);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 고객 지사별 비고 수정
	 * @param q
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "고객 지사별 비고 수정" ,notes = "고객 지사별 비고 수정")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "remark", value = "비고", required = true, dataType = "string", paramType = "query", defaultValue = ""),
	    @ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "deptId", value = "지사ID", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@GetMapping(value = "/setCodeCustInDept", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> updateCodeCustInDept(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        int result = gsCommonService.CODE_CUSTINDEPT_U01(q);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 고객 지사별 비고
	 * @param q
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "고객 지사별 비고" ,notes = "고객 지사별 비고")
	@ApiImplicitParams({
	    @ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "deptId", value = "지사ID", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@GetMapping(value = "/getCodeCustInDept", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> selectCodeCustInDept(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        String result = gsCommonService.CODE_CUSTINDEPT_R01(q);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 재가요양서비스 월 한도금액 가져오기 ( 등급 입력용 )
	 * @param q
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "재가요양서비스 월 한도금액 가져오기" ,notes = "재가요양서비스 월 한도금액 가져오기")
	@ApiImplicitParams({
	    @ApiImplicitParam(name = "level", value = "", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "rate", value = "", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@GetMapping(value = "/getCareBasicAmt", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GsCommon> selectCareBasicAmt(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        GsCommon result = gsCommonService.GET_CARE_BASIC_AMT(q);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
    
    /**
	 * 각종 마감 체크
	 * @param q
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "각종 마감 체크" ,notes = "각종 마감 체크")
	@ApiImplicitParams({
	    @ApiImplicitParam(name = "yymm", value = "년월(YYYYMM)", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "deptId", value = "지사ID", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@GetMapping(value = "/getChkClosing", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> selectChkClosing(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        int result = gsCommonService.CHK_CLOSING(q);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 각종 마감 처리
	 * @param q
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "각종 마감 처리" ,notes = "각종 마감 처리")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "col", value = "col", required = true, dataType = "string", paramType = "query", defaultValue = ""),
	    @ApiImplicitParam(name = "yymm", value = "년월(YYYYMM)", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "deptId", value = "지사ID", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@GetMapping(value = "/setCodeClosing", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> updateCodeClosing(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        int result = gsCommonService.CODE_CLOSING_U01(q);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 서비스 product_id 가져오기
	 * @param q
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "서비스 product_id 가져오기" ,notes = "서비스 product_id 가져오기")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "productCode", value = "품목코드", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@GetMapping(value = "/getProductId", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> selectProductId(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        String result = gsCommonService.GET_PRODUCT_ID(q);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * SetRemainAmtCalc 사용
	 * @param q
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "SetRemainAmtCalc 사용" ,notes = "SetRemainAmtCalc 사용")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "productCode", value = "품목코드", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@GetMapping(value = "/getRemainAmtCalc01", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GsCommon>> selectRemainAmtCalc01(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        List<GsCommon> result = gsCommonService.SetRemainAmtCalc_R01(q);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 
	 * @param q
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "SetRemainAmtCalc02" ,notes = "SetRemainAmtCalc02")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "date", value = "계약일", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@GetMapping(value = "/getRemainAmtCalc02", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GsCommon>> selectRemainAmtCalc02(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        List<GsCommon> result = gsCommonService.SetRemainAmtCalc_R02(q);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 
	 * @param q
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "SetRemainAmtCalc03" ,notes = "SetRemainAmtCalc03")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "comdivCode", value = "구분코드", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@GetMapping(value = "/getRemainAmtCalc03", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GsCommon>> selectRemainAmtCalc03(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        List<GsCommon> result = gsCommonService.SetRemainAmtCalc_R03(q);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
}
