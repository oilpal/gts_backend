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

import com.neofect.gts.services.ho.domain.HO03040;
import com.neofect.gts.services.ho.service.HO03040Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
// set user center permissions
@RequestMapping("/api/sucp")
public class HO03040Resource {

	@Autowired
	HO03040Service ho03040Service;
	
	/**
	 * 사용자-센터권한설정
	 * @param q
	 * @param HO03040
	 * @return
	 * @throws URISyntaxException
	 */
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<HO03040>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<HO03040> sucpList = ho03040Service.getSucpList(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(sucpList, headers, HttpStatus.OK);
    }
}
