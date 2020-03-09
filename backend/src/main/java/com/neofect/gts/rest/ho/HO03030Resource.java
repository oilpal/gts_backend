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

import com.neofect.gts.services.ho.domain.HO03030;
import com.neofect.gts.services.ho.service.HO03030Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/centerCopy")
public class HO03030Resource {

	@Autowired
	HO03030Service ho03030Service;
	
	/**
	 * 센터데이터복사
	 * @param q
	 * @param HO03030
	 * @return
	 * @throws URISyntaxException
	 */
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<HO03030>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<HO03030> centerCopyList = ho03030Service.getCenterCopyList(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(centerCopyList, headers, HttpStatus.OK);
    }
}
