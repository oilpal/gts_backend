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

import com.neofect.gts.services.ho.domain.HO04010;
import com.neofect.gts.services.ho.service.HO04010Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
//  Notice Management
@RequestMapping("/api/noticeM")
public class HO04010Resource {

	@Autowired
	HO04010Service ho04010Service;
	
	/**
	 * 시스템마감관리
	 * @param q
	 * @param HO04010
	 * @return
	 * @throws URISyntaxException
	 */
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<HO04010>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<HO04010> noticeMList = ho04010Service.getNoticeMList(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(noticeMList, headers, HttpStatus.OK);
    }
}
