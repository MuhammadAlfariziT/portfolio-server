package com.alfarizi.portfoliospringboot.api.controller;


import com.alfarizi.portfoliospringboot.api.entity.Project;
import com.alfarizi.portfoliospringboot.api.repository.ProjectRepository;
import com.alfarizi.portfoliospringboot.api.service.ProjectService;
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
@RequestMapping("/api/project")
public class ProjectController {


  @Autowired
  ProjectService projectService;


  @CrossOrigin
  @GetMapping
  public Flux<Project> getProjects(){

    return projectService.getProjects();
  }


  @PostMapping
  public Mono<Project> addProject(@RequestBody Project project){

    return projectService.addProject(project);
  }


  @PutMapping("/{id}")
  public Mono<Project> updateProject(@RequestBody Project project, @PathVariable String id){

    return projectService.updateProject(project, id);
  }


  @DeleteMapping("/{id}")
  public Mono<Void> deleteProject(@PathVariable String id){

    return projectService.deleteProject(id);
  }
}
