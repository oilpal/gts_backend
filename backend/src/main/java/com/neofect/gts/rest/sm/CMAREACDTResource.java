package com.neofect.gts.rest.sm;

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

import com.neofect.gts.services.sm.domain.CMAREACDT;
import com.neofect.gts.services.sm.service.CMAREACDTService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/cmareacdt")
public class CMAREACDTResource {

	@Autowired
	CMAREACDTService cmareacdtService;
	
	/**
	 * @param q
	 * SM0111 | [청소]작업장소관리]
	 * @param CM_AREA_CD_T_C01
	 * @return
	 * @throws URISyntaxException
	 */
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CMAREACDT>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<CMAREACDT> list = cmareacdtService.CMAREACDTC01(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(list, headers, HttpStatus.OK);
    }
}
