package com.neofect.gts.rest.worker;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neofect.gts.services.worker.worker.domain.Worker;
import com.neofect.gts.services.worker.worker.service.WorkerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 직원정보 관리 리소스 
 * @author jd
 *
 */
@CrossOrigin(origins="*")
@RestController
@Api(value = "WorkerInfo")
@RequestMapping("/api/worker/worker")
public class WorkerResource {

	@Autowired
	WorkerService service;
	
	/**
	 * 직원정보 목록
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "직원정보" ,notes = "직원정보 목록을 불러온다.")
	@ApiImplicitParams({
        @ApiImplicitParam(name = "deptId", value = "회사코드번호", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "gubunDiv", value = "직급", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "workYn", value = "재직상태", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "searchKeyword", value = "검색어", required = true, dataType = "string", paramType = "query", defaultValue = "")
   })
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Worker>> getWorkerInfoList(@RequestBody(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        List<Worker> list = service.selectWorkerInfoList(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(list, headers, HttpStatus.OK);
    }
	
	/**
	 * 주민번호 중복체크
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "주민번호 중복체크" ,notes = "사번과 주민번호로 ")
	@ApiImplicitParams({
        @ApiImplicitParam(name = "memberId", value = "사번", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "rrnNo", value = "주민번호", required = true, dataType = "string", paramType = "query", defaultValue = "")
   })
	@GetMapping(value = "/rrnNoDupCheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Worker> getWorkerRegistNumberDuplicateCheck(@RequestBody(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        Worker data= service.selectWorkerCheckRegistNumber(q);
        
        //주민번호가 13자리 인지 체크 13자리 아니라면 주민번호 자릿수를 확인해 주시기 바랍니다.
        //데이터가 있으면 중복된 데이터가 존재합니다
        //데이터가 없으면 중복된 데이터가 없습니다.
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(data, headers, HttpStatus.OK);
    }
}
