package com.itb.inf2am.pizzariaa.model.entity;

import jakarta.persistence.*;

@Entity
@Table ( name = "Usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (length = 45, nullable = true)
    private String nome;

    @Column (length = 15, nullable = true)
    private String cpf;

    @Column (length = 20, nullable = false)
    private String tipoUsuario;

    @Column (length = 45, nullable = false)
    private String email;

    @Column (length = 255, nullable = false)
    private String senha;

    @Column (length = 20, nullable = false)
    private String sexo;

    @Column (length = 45, nullable = true)
    private String logradouro;

    @Column (length = 102, nullable = true)
    private String cep;

    @Column (length = 45, nullable = true)
    private String bairro;

    @Column (length = 45, nullable = true)
    private String cidade;

    private boolean cod_status;

    @Column (length = 45, nullable = false)
    private String uf;

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

    public String getCpf() {
        return cpf;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean isCod_status() {
        return cod_status;
    }

    public void setCod_status(boolean cod_status) {
        this.cod_status = cod_status;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
