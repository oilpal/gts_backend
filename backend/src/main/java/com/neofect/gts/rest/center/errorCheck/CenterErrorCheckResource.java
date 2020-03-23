package com.neofect.gts.rest.center.errorCheck;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neofect.gts.services.center.errorCheck.domain.ErrorCheck;
import com.neofect.gts.services.center.errorCheck.service.CenterErrorCheckService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="*")
@RestController
@Api(value = "CenterErrorCheckResource")
@RequestMapping("/api/errchk")
public class CenterErrorCheckResource {

	@Autowired
	CenterErrorCheckService centerErrorCheckService;
	
	/**
	 * 오류 목록 체크 리스트
	 * @param q
	 * @param HO01010
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "오류 목록 체크 리스트" ,notes = "이것은 오류 목록 체크 리스트를 불러온다.")
	@ApiImplicitParams({
        @ApiImplicitParam(name = "deptId", value = "회사코드번호 ex : 11005", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "yyyymm", value = "집계년월 ex : 202002", required = true, dataType = "string", paramType = "query", defaultValue = ""),
    })
	@PostMapping(value = "/errorItemsList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ErrorCheck>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<ErrorCheck> errChkList = centerErrorCheckService.getErrorList(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(errChkList, headers, HttpStatus.OK);
    }

	/**
	 * 오류 리스트
	 * @param q
	 * @param HO01010
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "오류 리스트" ,notes = "이것은 오류 리스트를 불러온다.")
	@ApiImplicitParams({
        @ApiImplicitParam(name = "deptId", value = "회사코드번호 ex : 11005", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "custId", value = "고객코드번호 ex : 68841", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "memberId", value = "멤버ID ex : 10170055", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "yyyymm", value = "집계년월 ex : 202002", required = true, dataType = "string", paramType = "query", defaultValue = ""),
    })
	@GetMapping(value = "/errorList", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ErrorCheck>> errorList(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
		if (q == null) {
			q = new HashMap<String,Object>();
		}
		
		List<ErrorCheck> errChkList = centerErrorCheckService.getErrorDetail(q);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(errChkList, headers, HttpStatus.OK);
	}
}
