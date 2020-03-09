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

import com.neofect.gts.services.sm.domain.SmAuthMenuGroup;
import com.neofect.gts.services.sm.service.SmAuthMenuGroupService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/smAuthMenuGroup")
public class SmAuthMenuGroupResource {

	@Autowired
	SmAuthMenuGroupService smAuthMenuGroupService;
	
	/**
	 * @param q
	 * @param SmAuthMenuGroup
	 * @return
	 * @throws URISyntaxException
	 */
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SmAuthMenuGroup>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<SmAuthMenuGroup> list = smAuthMenuGroupService.SMAUTHMENUGROUPC01(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(list, headers, HttpStatus.OK);
    }
}
