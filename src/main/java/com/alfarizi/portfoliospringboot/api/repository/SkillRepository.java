package com.alfarizi.portfoliospringboot.api.repository;

import com.alfarizi.portfoliospringboot.api.entity.Skills;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface SkillRepository extends ReactiveMongoRepository<Skills, String> {

  Flux<Skills> findByCategory(String category);
}
