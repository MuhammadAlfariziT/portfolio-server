package com.alfarizi.portfoliospringboot.api.service;


import com.alfarizi.portfoliospringboot.api.entity.Certificate;
import com.alfarizi.portfoliospringboot.api.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CertificateService {

  @Autowired
  CertificateRepository certificateRepository;

  public Flux<Certificate> getCertificates(){

    return certificateRepository.findAll();
  }


  public Mono<Certificate> AddCertificate(Certificate certificate){

    return certificateRepository.save(certificate);
  }


  public Mono<Certificate> updateCertificate(Certificate certificate, String id){

    return certificateRepository
        .findById(id)
        .flatMap( entity -> {
          entity.setId(id);
          entity.setName(certificate.getName());
          entity.setCredential_id(certificate.getCredential_id());
          entity.setCredential_url(certificate.getCredential_url());
          entity.setDescription(certificate.getDescription());
          entity.setOrganization_issued(certificate.getOrganization_issued());
          entity.setOrganization_icon(certificate.getOrganization_icon());
          entity.setField(certificate.getField());

          return certificateRepository.save(entity);
        } );
  }

  public Mono<Void> deleteCertificate(String id){

    return certificateRepository.deleteById(id);
  }
}
