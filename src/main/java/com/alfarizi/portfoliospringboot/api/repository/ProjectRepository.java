package com.alfarizi.portfoliospringboot.api.repository;

import com.alfarizi.portfoliospringboot.api.entity.Project;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends ReactiveMongoRepository<Project, String> {

}
