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

import com.neofect.gts.services.ho.domain.HO03050;
import com.neofect.gts.services.ho.service.HO03050Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
// Care cost management
@RequestMapping("/api/ccm")
public class HO03050Resource {

	@Autowired
	HO03050Service ho03050Service;
	
	/**
	 * 요양비용관리
	 * @param q
	 * @param HO03050
	 * @return
	 * @throws URISyntaxException
	 */
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<HO03050>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<HO03050> ccmList = ho03050Service.getCcmList(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(ccmList, headers, HttpStatus.OK);
    }
}
