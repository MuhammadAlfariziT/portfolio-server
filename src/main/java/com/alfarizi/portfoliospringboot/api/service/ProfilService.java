package com.alfarizi.portfoliospringboot.api.service;

import com.alfarizi.portfoliospringboot.api.entity.Profil;
import com.alfarizi.portfoliospringboot.api.repository.ProfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProfilService {

  @Autowired
  ProfilRepository profilRepository;

  public Mono<Profil> getProfilInformation(){

    return profilRepository.findById("1");
  }

  public Mono<Profil> saveProfil(){

    Profil profil = new Profil("1", "Muhammad Alfarizi Tazkia", "Backend Engineer Enthusiast", "profil.jpg", "Hello I Am Muhammad Alfarizi Tazkia");

    return profilRepository.save(profil);
  }

  public Mono<Profil> updateProfilInformation(Profil profilDto) {

    return profilRepository.findById("1")
        .flatMap( profil -> {
          profil.setId("1");
          profil.setName(profilDto.getName());
          profil.setBio(profilDto.getBio());
          profil.setImage(profilDto.getImage());
          profil.setPersonal_summary(profilDto.getPersonal_summary());

          return profilRepository.save(profil);
        });
  }
}
