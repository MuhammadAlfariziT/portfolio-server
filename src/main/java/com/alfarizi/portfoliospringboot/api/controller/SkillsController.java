package com.alfarizi.portfoliospringboot.api.controller;


import com.alfarizi.portfoliospringboot.api.entity.Skills;
import com.alfarizi.portfoliospringboot.api.service.SkillService;
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
@RequestMapping("/api/skills")
public class SkillsController {


  @Autowired
  SkillService skillService;


  @CrossOrigin
  @GetMapping
  public Flux<Skills> getSkills(){

    return skillService.getSkills();
  }


  @PostMapping
  public Mono<Skills> addSkills(@RequestBody Skills skills){

    return skillService.addSkills(skills);
  }


  @PutMapping("/{id}")
  public Mono<Skills> updateSkills(@RequestBody Skills skills, @PathVariable String id){

    return skillService.updateSkill(skills, id);
  }


  @DeleteMapping("/{id}")
  public Mono<Void> deleteSkills(@PathVariable String id){

    return skillService.deleteSkills(id);
  }

}
