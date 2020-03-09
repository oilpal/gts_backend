package com.neofect.gts.rest.ho;

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

import com.neofect.gts.services.ho.domain.HO03060;
import com.neofect.gts.services.ho.service.HO03060Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
//  System Closure management
@RequestMapping("/api/scm")
public class HO03060Resource {

	@Autowired
	HO03060Service ho03060Service;
	
	/**
	 * 시스템마감관리
	 * @param q
	 * @param HO03060
	 * @return
	 * @throws URISyntaxException
	 */
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<HO03060>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<HO03060> scmList = ho03060Service.getScmList(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(scmList, headers, HttpStatus.OK);
    }
}
