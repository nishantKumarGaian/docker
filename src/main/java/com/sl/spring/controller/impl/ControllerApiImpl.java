package com.sl.spring.controller.impl;

import com.sl.spring.domain.ResponseFirst;
import com.sl.spring.domain.ResponseSecond;
import com.sl.spring.domain.ResponseThird;
import com.sl.spring.controller.ControllerApi;
import com.sl.spring.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.logging.Logger;

/**
 * Api implemention
 *
 * @author nishant
 */

@Controller
public class ControllerApiImpl implements ControllerApi {
	private static final String ENTITY_NAME = "TestService";

	private final Logger logger = Logger.getLogger(ControllerApiImpl.class.getName());
	private String applicationName;
    @Autowired
    private Service service;

    @Override
    public ResponseEntity<ResponseFirst> getResponseFirst(@RequestHeader(value = "Accept", required = false) String accept) throws Exception{
        return ResponseEntity.ok(service.getFirstResponse());
    }

    @Override
    public ResponseEntity<ResponseSecond> getResponseSecond(@RequestHeader(value = "Accept", required = false) String accept) throws Exception{
        return ResponseEntity.ok(service.getSecondResponse());
    }

    @Override
    public ResponseEntity<ResponseThird> getResponseThird(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        return ResponseEntity.ok(service.getThirdResponse());
    }

}
