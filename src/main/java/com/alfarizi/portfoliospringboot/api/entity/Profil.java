package com.alfarizi.portfoliospringboot.api.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class Profil {

  @Id
  private String id;
  private String name;
  private String bio;
  private String image;
  private String personal_summary;
}
