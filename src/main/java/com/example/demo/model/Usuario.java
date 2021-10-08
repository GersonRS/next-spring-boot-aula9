package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String login;
  @Column
  private String senha;

  public Usuario() {
  }

  public Usuario(String login, String senha) {
    this.login = login;
    this.senha = senha;
  }

  public Usuario(Long id, String login, String senha) {
    this.id = id;
    this.login = login;
    this.senha = senha;
  }
    
}
