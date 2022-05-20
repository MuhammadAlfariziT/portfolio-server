package com.alfarizi.portfoliospringboot.api.entity;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Work {

  @Id
  private String id;
  private String company;
  private String company_icon;
  private String position;
  private String start;
  private String end;
  private String type;
  private String description;
  private List<String> stack_technology;
}
