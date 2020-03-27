package com.neofect.gts.rest.worker;

import java.net.URISyntaxException;
import java.util.ArrayList;
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

import com.neofect.gts.services.common.domain.Code;
import com.neofect.gts.services.common.service.CodeService;
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
	
	@Autowired
	CodeService codeService;
	
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
	
	/**
	 * 직원정보에 사용하는 코드 정보
	 * @param q
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "직원정보 코드 정보" ,notes = "직원정보에 사용되는 코드 정보")
	@GetMapping(value = "/code/info", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String,Object>> getWorkerCodeGroup(@RequestBody(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
        Map<String,Object> result = new HashMap<String,Object>();
        
        q.put("hcode", "0103");
        q.put("use", "Y");
        //직급
        List<Code> gubunDivList = codeService.selectCodeComdivList(q);
        result.put("gubunDivList", gubunDivList);
        
        //재직여부 코드
        List<Code> workYnList = new ArrayList<Code>();
        Code eo = new Code();
        eo.setCode("Y");
        eo.setLabel("재직중");
        workYnList.add(eo);
        eo = new Code();
        eo.setCode("N");
        eo.setLabel("퇴직");
        workYnList.add(eo);
        result.put("workYnList", workYnList);
        
        //장애등급
        q.put("hcode", "0145");
        List<Code> handicapLevelList = codeService.selectCodeComdivList(q);
        result.put("handicapLevelList", handicapLevelList);
        
        //
        q.put("hcode", "0102");
        List<Code> memberDivList = codeService.selectCodeComdivList(q);
        result.put("memberDivList", memberDivList);
        
        q.put("hcode", "0104");
        List<Code> licenselevelDivList = codeService.selectCodeComdivList(q);
        result.put("licenselevelDivList", licenselevelDivList);
        
        //급여계좌정보의 은행 
        q.put("hcode", "0100");
        List<Code> bankDivList = codeService.selectCodeComdivList(q);
        result.put("bankDivList", bankDivList);
        
        q.put("hcode", "9999");
        List<Code> authorityDivList = codeService.selectCodeComdivList(q);
        result.put("authorityDivList", authorityDivList);
        
        //급여종류
        q.put("sysId", "SM");
        q.put("hcode", "PAYTYPE");
        List<Code> payTypeList = codeService.selectSmCommonCodeListByDvalue2(q);
        result.put("payTypeList", payTypeList);
        
        //퇴직정산방법
        q.put("sysId", "SM");
        q.put("hcode", "RETIRECALCTYPE");
        List<Code> retirecalctypeList = codeService.selectSmCommonCodeListByDvalue2(q);
        result.put("retirecalctypeList", retirecalctypeList);
        
        //보험가입구분
        q.put("sysId", "SM");
        q.put("hcode", "LIINSURANCETYPE");
        List<Code> liinsurancetypeList = codeService.selectSmCommonCodeListByDvalue2(q);
        result.put("liinsurancetypeList", liinsurancetypeList);
        
        //건강보험적용
        q.put("sysId", "SM");
        q.put("hcode", "HEALTHINSURETAG");
        List<Code> healthinsuretagList = codeService.selectSmCommonCodeListByDvalue2(q);
        result.put("healthinsuretagList", healthinsuretagList);
        
        //국민연금적용
        q.put("sysId", "SM");
        q.put("hcode", "NATIONALPENSIONTAG");
        List<Code> nationalpensiontagList = codeService.selectSmCommonCodeListByDvalue2(q);
        result.put("nationalpensiontagList", nationalpensiontagList);
        
        //고용보험적용
        q.put("sysId", "SM");
        q.put("hcode", "GOYONGTAG");
        List<Code> goyongtagList = codeService.selectSmCommonCodeListByDvalue2(q);
        result.put("goyongtagList", goyongtagList);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
	
	
}
