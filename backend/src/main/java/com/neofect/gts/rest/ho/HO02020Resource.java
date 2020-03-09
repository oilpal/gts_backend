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

import com.neofect.gts.services.ho.domain.HO02020;
import com.neofect.gts.services.ho.service.HO02020Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/simtax")
public class HO02020Resource {

	@Autowired
	HO02020Service ho02020Service;
	
	/**
	 * 간이세액조견표
	 * @param q
	 * @param HO02020
	 * @return
	 * @throws URISyntaxException
	 */
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<HO02020>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<HO02020> simtaxList = ho02020Service.getSimpleTaxList(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(simtaxList, headers, HttpStatus.OK);
    }
}
