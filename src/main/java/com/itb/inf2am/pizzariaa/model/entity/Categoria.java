package com.itb.inf2am.pizzariaa.model.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-incremento
    private long id;

    @Column(length = 45, nullable = false)
    private String nome;

    @Column(length = 225)
    private String descricao;


    private boolean codStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}
