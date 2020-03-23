package com.neofect.gts.rest.center.item;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neofect.gts.services.center.item.domain.CenterItem;
import com.neofect.gts.services.center.item.service.CenterItemService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins="*")
@RestController
@Api(value = "CenterItemResource")
@RequestMapping("/api/centerItem")
public class CenterItemResource {

	@Autowired
	CenterItemService centerItemService;
	
	/**
	 * 서비스 품목 체크 리스트
	 * @param q
	 * @param 
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "서비스 품목 체크 리스트" ,notes = "이것은 서비스 품목 체크 리스트를 불러온다.")
	@ApiImplicitParams({
        @ApiImplicitParam(name = "useYn", value = "사용여부 ex : Y", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "productDiv", value = "서비스구분 ex : 1", required = true, dataType = "string", paramType = "query", defaultValue = ""),
        @ApiImplicitParam(name = "date", value = "적용일 ex : 20200323", required = true, dataType = "string", paramType = "query", defaultValue = ""),
    })
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CenterItem>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<CenterItem> serItemList = centerItemService.getServiceItemList(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(serItemList, headers, HttpStatus.OK);
    }

	/**
	 * 서비스 품목 추가
	 * @param q
	 * @param 
	 * @return
	 * @throws URISyntaxException
	 */
	@ApiOperation(value = "서비스 품목 추가" ,notes = "이것은 서비스 품목 추가를 불러온다.")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "productDiv", value = "품목 구분", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "productCode", value = "품목 코드", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "productName", value = "품목명", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "serviceMin", value = "서비스분수", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "saleAmt", value = "판매단가", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "deptSaleAmt", value = "자사판매단가", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "introRate", value = "소개수수료율", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "startDate", value = "적용시작일", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "endDate", value = "적용종료일", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "useYn", value = "사용여부", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "unitDiv", value = "박스단위", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "roundYn", value = "roundYn", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "custLevelDiv", value = "custLevelDiv", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "familyYn", value = "가족케어여부", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "prooffiDiv", value = "prooffiDiv", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "psepDiv", value = "psepDiv", required = true, dataType = "string", paramType = "query", defaultValue = ""),
	})
	@PostMapping(value = "/insertService", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> insertService(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
		if (q == null) {
			q = new HashMap<String,Object>();
		}
		
		int serItemList = centerItemService.insertCenterItemService(q);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(serItemList, headers, HttpStatus.OK);
	}
}
