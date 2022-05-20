package com.alfarizi.portfoliospringboot.api.controller;


import com.alfarizi.portfoliospringboot.api.entity.Profil;
import com.alfarizi.portfoliospringboot.api.service.ProfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/profil")
public class ProfilController {

  @Autowired
  ProfilService profilService;

  @CrossOrigin
  @GetMapping
  public Mono<Profil> getProfilInformation(){

    return profilService.getProfilInformation();
  }

  @GetMapping("/new")
  public Mono<Profil> saveProfil(){

    return profilService.saveProfil();
  }

  @PutMapping("/update")
  public Mono<Profil> updateProfilInformation(@RequestBody Profil profil){

    return profilService.updateProfilInformation(profil);
  }
}
