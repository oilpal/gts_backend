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

import com.neofect.gts.services.ho.domain.HO01010;
import com.neofect.gts.services.ho.service.HO01010Service;
import com.neofect.gts.services.sm.domain.SM01012;
import com.neofect.gts.services.sm.domain.SM01020;
import com.neofect.gts.services.sm.domain.SMCOMCODE;
import com.neofect.gts.services.sm.service.SM01012Service;
import com.neofect.gts.services.sm.service.SM01020Service;
import com.neofect.gts.services.sm.service.SMCOMCODEService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/accountReg")
public class SM01020Resource {

	@Autowired
	SM01020Service sm01020Service;
	
	/**
	 * 거래처 등록
	 * @param q
	 * @param SM01020
	 * @return
	 * @throws URISyntaxException
	 */
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SM01020>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<SM01020> accountRegList = sm01020Service.SM0102001(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(accountRegList, headers, HttpStatus.OK);
    }
}
