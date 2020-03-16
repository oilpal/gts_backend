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
import com.neofect.gts.services.common.domain.GS_COMMON;
import com.neofect.gts.services.common.service.GS_COMMONService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="*")
@RestController
@Api(value = "GS_COMMONResource")
@RequestMapping("/api/gs/common")
public class GS_COMMONResource {

	@Autowired 
	GS_COMMONService gs_CommonService;
	
	/**
	 * 최근 계약번호 가져오기
	 * @param q
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiImplicitParams({
	    @ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "deptId", value = "지사ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "yymm", value = "년월", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@ApiOperation(value = "최근 계약번호" ,notes = "최근 계약번호 가져오기")
	@GetMapping(value = "/getMaxContSeq", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> getMaxContSeq(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        int result = gs_CommonService.GET_MAX_CONTSEQ(q);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 고객 지사별 비고 수정
	 * @param q
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiImplicitParams({
		@ApiImplicitParam(name = "remark", value = "비고", required = true, dataType = "string", paramType = "query", defaultValue = ""),
	    @ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "deptId", value = "지사ID", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@ApiOperation(value = "고객 지사별 비고 수정" ,notes = "고객 지사별 비고 수정")
	@GetMapping(value = "/updateCodeCustInDept", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> updateCodeCustInDept(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        int result = gs_CommonService.CODE_CUSTINDEPT_U01(q);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	/**
	 * 고객 지사별 비고
	 * @param q
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiImplicitParams({
	    @ApiImplicitParam(name = "custId", value = "고객ID", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "deptId", value = "지사ID", required = true, dataType = "string", paramType = "query", defaultValue = "")
	})
	@ApiOperation(value = "고객 지사별 비고" ,notes = "고객 지사별 비고")
	@GetMapping(value = "/getCodeCustInDept", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getCodeCustInDept(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        
        String result = gs_CommonService.CODE_CUSTINDEPT_R01(q);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
}
