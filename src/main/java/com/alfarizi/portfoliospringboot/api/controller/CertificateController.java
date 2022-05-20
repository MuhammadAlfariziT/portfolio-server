package com.alfarizi.portfoliospringboot.api.controller;


import com.alfarizi.portfoliospringboot.api.entity.Certificate;
import com.alfarizi.portfoliospringboot.api.service.CertificateService;
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
@RequestMapping("/api/certificate")
public class CertificateController {


  @Autowired
  CertificateService certificateService;


  @CrossOrigin
  @GetMapping
  public Flux<Certificate> getCertificates(){

    return certificateService.getCertificates();
  }


  @PostMapping
  public Mono<Certificate> addCertificate(@RequestBody Certificate certificate){

    return certificateService.AddCertificate(certificate);
  }

  @PutMapping("/{id}")
  public Mono<Certificate> updateCertificate(@RequestBody Certificate certificate, @PathVariable String id){

    return certificateService.updateCertificate(certificate, id);
  }

  @DeleteMapping("/{id}")
  public Mono<Void> deleteCertificate(@PathVariable String id){

    return certificateService.deleteCertificate(id);
  }
}
