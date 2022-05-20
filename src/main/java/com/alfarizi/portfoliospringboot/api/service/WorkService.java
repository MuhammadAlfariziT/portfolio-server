package com.alfarizi.portfoliospringboot.api.service;

import com.alfarizi.portfoliospringboot.api.entity.Work;
import com.alfarizi.portfoliospringboot.api.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WorkService {


  @Autowired
  private WorkRepository workRepository;

  public Flux<Work> getWorks(){

    return workRepository.findAll();
  }


  public Mono<Work> addWork(Work work){

    return workRepository.save(work);
  }


  public Mono<Work> updateWork(Work work, String id){

    return workRepository
        .findById(id)
        .flatMap( entity -> {
          entity.setId(id);
          entity.setCompany(work.getCompany());
          entity.setPosition(work.getPosition());
          entity.setStart(work.getStart());
          entity.setEnd(work.getEnd());
          entity.setType(work.getType());
          entity.setDescription(work.getDescription());
          entity.setCompany_icon(work.getCompany_icon());
          entity.setStack_technology(work.getStack_technology());

          return workRepository.save(work);
        });
  }

  public Mono<Void> deleteWork(String id){

    return workRepository.deleteById(id);
  }
}
