package com.sl.spring.service.impl;

/**
 * @author nishant
 */

import com.sl.spring.domain.ResponseFirst;
import com.sl.spring.domain.ResponseSecond;
import com.sl.spring.domain.ResponseThird;
import com.sl.spring.repository.ResponseFirstRepository;
import com.sl.spring.repository.ResponseSecondRepository;
import com.sl.spring.repository.ResponseThirdRepository;
import com.sl.spring.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * Service Implementation for managing Ticket.
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Autowired
    private ResponseFirstRepository responseFirstRepository;
    @Autowired
    private ResponseSecondRepository responseSecondRepository;
    @Autowired
    private ResponseThirdRepository responseThirdRepository;

    @Override
    public ResponseFirst getFirstResponse() {
        Optional<ResponseFirst> response = responseFirstRepository.findAll().stream().findFirst();
        if(response.isPresent()){
            return response.get();
        }
        return new ResponseFirst("MsgFirst");
    }

    @Override
    public ResponseSecond getSecondResponse() throws InterruptedException {
        Optional<ResponseSecond> response = responseSecondRepository.findAll().stream().findFirst();
        if(response.isPresent()){
            return response.get();
        }
        Thread.sleep(2000);
        return new ResponseSecond("MsgSecond");
    }

    @Override
    public ResponseThird getThirdResponse() {
        Optional<ResponseThird> response = responseThirdRepository.findAll().stream().findFirst();
        if(response.isPresent()){
            return response.get();
        }
        return new ResponseThird("MsgThird");
    }
}