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
import com.neofect.gts.services.sm.domain.CMMAGAMJECDT;
import com.neofect.gts.services.sm.domain.CMORGSTANDARDT;
import com.neofect.gts.services.sm.service.CMAREACDTService;
import com.neofect.gts.services.sm.service.CMMAGAMJECDTService;
import com.neofect.gts.services.sm.service.CMORGSTANDARDTService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/cmorgstandardt")
public class CMORGSTANDARDTResource {

	@Autowired
	CMORGSTANDARDTService cmorgstandardtService;
	
	/**
	 * @param q
	 * SM0115 | [청소]표준업무관리]
	 * @param CM_ORG_STANDARD_T_C01
	 * @return
	 * @throws URISyntaxException
	 */
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CMORGSTANDARDT>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<CMORGSTANDARDT> list = cmorgstandardtService.CMORGSTANDARDTC01(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(list, headers, HttpStatus.OK);
    }
}
