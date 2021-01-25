package com.todoapp.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarefa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private long codigo;

    private String nome;
    private String feito;

    public long getCodigo(){
        return codigo;
    }

    public void setCodigo(long codigo){
        this.codigo=codigo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getFeito(){
        return feito;
    }
    public void setFeito(String feito){
        this.feito = feito;
    }

}
