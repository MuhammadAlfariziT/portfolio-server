package com.alfarizi.portfoliospringboot.api.controller;


import com.alfarizi.portfoliospringboot.api.entity.Work;
import com.alfarizi.portfoliospringboot.api.service.WorkService;
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
@RequestMapping("/api/work")
public class WorkController {


  @Autowired
  WorkService workService;


  @CrossOrigin
  @GetMapping
  public Flux<Work> getWorks(){

    return workService.getWorks();
  }


  @PostMapping
  public Mono<Work> addWork(@RequestBody Work work){

    return workService.addWork(work);
  }


  @PutMapping("/{id}")
  public Mono<Work> updateWork(@RequestBody Work work, @PathVariable String id){

    return workService.updateWork(work, id);
  }


  @DeleteMapping("/{id}")
  public Mono<Void> deleteWork(@PathVariable String id){

    return workService.deleteWork(id);
  }

}
