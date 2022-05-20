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
public class Project {


  @Id
  private String id;
  private String name;
  private String icon;
  private String description;
  private String field;
  private String time;
  private String position;
}
