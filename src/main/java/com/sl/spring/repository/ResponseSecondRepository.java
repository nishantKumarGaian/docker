package com.sl.spring.repository;

import com.sl.spring.domain.ResponseSecond;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author nishant
 */
@Repository
public interface ResponseSecondRepository extends MongoRepository<ResponseSecond, String> {
}
