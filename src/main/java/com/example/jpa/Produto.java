package com.example.jpa;

import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="pessoa")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String nome;
    private  String email;
    private LocalDate dataCadastro = LocalDate.now();

    public Produto(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public Produto() {

    }


    //#region Getters and Setters


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    //#endregion
}

