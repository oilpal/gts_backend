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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neofect.gts.services.common.domain.Code;
import com.neofect.gts.services.common.service.CodeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@Api(value = "CodeResource")
@RequestMapping("/api/code")
public class CodeResource {

	
	@Autowired 
	CodeService codeService;
	
	/**
	 * 공통 코드 목록
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "공통 코드 목록" ,notes = "이것은 공통코드를 불러온다.")
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Code>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        q.put("useYn", "Y");	//사용여부
        q.put("hcode", "DAY");
        q.put("sysId", "SM");
        List<Code> codeList = codeService.getSmCommonCodeList(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(codeList, headers, HttpStatus.OK);
    }
}
