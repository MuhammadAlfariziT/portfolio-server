package com.alfarizi.portfoliospringboot.api.repository;

import com.alfarizi.portfoliospringboot.api.entity.Work;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends ReactiveMongoRepository<Work, String> {

}
