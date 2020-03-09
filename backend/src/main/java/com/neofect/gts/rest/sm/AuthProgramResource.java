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

import com.neofect.gts.services.sm.domain.AuthMenu;
import com.neofect.gts.services.sm.domain.AuthProgram;
import com.neofect.gts.services.sm.domain.SM900002;
import com.neofect.gts.services.sm.service.AuthMenuService;
import com.neofect.gts.services.sm.service.AuthProgramService;
import com.neofect.gts.services.sm.service.SM900002Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/authProgram")
public class AuthProgramResource {

	@Autowired
	AuthProgramService authProgramService;
	
	/**
	 * @param q
	 * @param AuthProgram
	 * @return
	 * @throws URISyntaxException
	 */
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AuthProgram>> listCode(@RequestParam(required = false) Map<String, Object> q) throws URISyntaxException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }

        List<AuthProgram> list = authProgramService.AuthProgramE01(q);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(list, headers, HttpStatus.OK);
    }
}
