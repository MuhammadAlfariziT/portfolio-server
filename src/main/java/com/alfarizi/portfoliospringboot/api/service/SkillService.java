package com.alfarizi.portfoliospringboot.api.service;

import com.alfarizi.portfoliospringboot.api.entity.Skills;
import com.alfarizi.portfoliospringboot.api.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SkillService {


  @Autowired
  SkillRepository skillRepository;


  public Flux<Skills> getSkills(){

    return skillRepository.findAll();
  }


  public Mono<Skills> addSkills(Skills skills){

    return skillRepository.save(skills);
  }


  public Mono<Skills> updateSkill(Skills skills, String id){

    return skillRepository
        .findById(id)
        .flatMap( entity -> {
          entity.setId(id);
          entity.setCategory(skills.getCategory());
          entity.setName(skills.getName());
          entity.setFluently_score(skills.getFluently_score());

          return skillRepository.save(entity);
        });
  }


  public Mono<Void> deleteSkills(String id){

    return skillRepository.deleteById(id);
  }
}
