package com.Projeto.Springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Servico  {
    @Id
    @GeneratedValue
    private Integer Id;
    private String nome;
    private Double valor;

    public Integer getId(){
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private Double getValor(){
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}



