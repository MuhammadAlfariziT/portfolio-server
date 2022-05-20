package com.alfarizi.portfoliospringboot.api.service;


import com.alfarizi.portfoliospringboot.api.entity.Education;
import com.alfarizi.portfoliospringboot.api.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EducationService {


  @Autowired
  EducationRepository educationRepository;


  public Flux<Education> getEducations(){

    return educationRepository.findAll();
  }


  public Mono<Education> addEducation(Education education){

    return educationRepository.save(education);
  }


  public Mono<Education> updateEducation(Education education, String id){

    return educationRepository
        .findById(id)
        .flatMap(entity -> {
          entity.setId(id);
          entity.setDescription(education.getDescription());
          entity.setInstitution(education.getInstitution());
          entity.setMajory(education.getMajory());

          return educationRepository.save(entity);
        });
  }


  public Mono<Void> deleteEducation(String id){

    return educationRepository.deleteById(id);
  }
}
