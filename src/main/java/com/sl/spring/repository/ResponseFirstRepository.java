package com.sl.spring.repository;

import com.sl.spring.domain.ResponseFirst;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author nishant
 */
@Repository
public interface ResponseFirstRepository extends MongoRepository<ResponseFirst, String> {
}
