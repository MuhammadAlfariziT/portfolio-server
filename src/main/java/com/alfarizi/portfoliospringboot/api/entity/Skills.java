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
public class Skills {

  @Id
  private String id;
  private String category;
  private String name;
  private int fluently_score;
}
