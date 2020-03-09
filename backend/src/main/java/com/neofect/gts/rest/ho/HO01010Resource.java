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

import com.neofect.gts.services.ho.domain.HO01010;
import com.neofect.gts.services.ho.service.HO01010Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/errchk")
public class HO01010Resource {

	@Autowired
	HO01010Service ho01010Service;
	
	/**
	 * 오류 목록 체크 리스트
	 * @param q
	 * @param HO01010
	 * @return
	 * @throws URISyntaxException
	 */
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<HO01010>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<HO01010> errChkList = ho01010Service.getErrorList(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(errChkList, headers, HttpStatus.OK);
    }
}
