package com.alfarizi.portfoliospringboot.api.controller;


import com.alfarizi.portfoliospringboot.api.entity.Education;
import com.alfarizi.portfoliospringboot.api.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/education")
public class EducationController {


  @Autowired
  EducationService educationService;


  @CrossOrigin
  @GetMapping
  public Flux<Education> getEducations(){

    return educationService.getEducations();
  }


  @PostMapping
  public Mono<Education> addEducation(@RequestBody Education education){

    return educationService.addEducation(education);
  }


  @PutMapping("/{id}")
  public Mono<Education> updateEducation(@RequestBody Education education, @PathVariable String id){

    return educationService.updateEducation(education, id);
  }


  @DeleteMapping("/{id}")
  public Mono<Void> deleteEducation(@PathVariable String id){


    return educationService.deleteEducation(id);
  }

}
