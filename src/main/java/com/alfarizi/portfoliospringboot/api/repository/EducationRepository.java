package com.alfarizi.portfoliospringboot.api.repository;

import com.alfarizi.portfoliospringboot.api.entity.Education;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducationRepository extends ReactiveMongoRepository<Education, String> {

}
