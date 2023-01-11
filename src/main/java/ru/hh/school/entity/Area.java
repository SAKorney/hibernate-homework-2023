package ru.hh.school.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class Area {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "area_id")
  private Integer id;

  private String name;

  @Deprecated
  public Area() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
