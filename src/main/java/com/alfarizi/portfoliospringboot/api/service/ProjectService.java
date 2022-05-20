package com.alfarizi.portfoliospringboot.api.service;

import com.alfarizi.portfoliospringboot.api.entity.Project;
import com.alfarizi.portfoliospringboot.api.entity.Work;
import com.alfarizi.portfoliospringboot.api.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProjectService {


  @Autowired
  ProjectRepository projectRepository;


  public Flux<Project> getProjects(){

    return projectRepository.findAll();
  }


  public Mono<Project> addProject(Project project){

    return projectRepository.save(project);
  }


  public Mono<Project> updateProject(Project project, String id){

    return projectRepository
        .findById(id)
        .flatMap(entity -> {
          entity.setId(id);
          entity.setName(project.getName());
          entity.setDescription(project.getDescription());
          entity.setField(project.getField());
          entity.setIcon(project.getIcon());
          entity.setPosition(project.getPosition());
          entity.setTime(project.getTime());

          return projectRepository.save(entity);
        });
  }


  public Mono<Void> deleteProject(String id){

    return projectRepository.deleteById(id);
  }
}
