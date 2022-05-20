package com.alfarizi.portfoliospringboot.api.repository;

import com.alfarizi.portfoliospringboot.api.entity.Profil;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilRepository extends ReactiveMongoRepository<Profil, String> {

}
