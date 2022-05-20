package com.alfarizi.portfoliospringboot.api.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Certificate {

  @Id
  private String id;
  private String name;
  private String description;
  private String organization_issued;
  private String organization_icon;
  private String credential_id;
  private String credential_url;
  private String field;}
