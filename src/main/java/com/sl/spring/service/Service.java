package com.sl.spring.service;

import com.sl.spring.domain.ResponseFirst;
import com.sl.spring.domain.ResponseSecond;
import com.sl.spring.domain.ResponseThird;
/**
 * @author nishant
 */
public interface Service {

    ResponseFirst getFirstResponse();
    ResponseSecond getSecondResponse() throws InterruptedException;
    ResponseThird getThirdResponse();

}
