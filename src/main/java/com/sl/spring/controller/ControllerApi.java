package com.sl.spring.controller;


import com.sl.spring.domain.ResponseFirst;
import com.sl.spring.domain.ResponseSecond;
import com.sl.spring.domain.ResponseThird;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * Provides the info about api methods
 *
 * @author nishant
 */

@Validated
@CrossOrigin("*")
public interface ControllerApi {

    @GetMapping(value = {"/first"}, produces = {
        "application/json"})
    ResponseEntity<ResponseFirst> getResponseFirst(@RequestHeader(value = "Accept", required = false) String accept) throws Exception;

    @GetMapping(value = {"/two"}, produces = {
        "application/json"})
    ResponseEntity<ResponseSecond> getResponseSecond(@RequestHeader(value = "Accept", required = false) String accept) throws Exception;

    @GetMapping(value = {"/third"}, produces = {
        "application/json"})
    ResponseEntity<ResponseThird> getResponseThird(@RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
