package com.itb.inf2am.pizzariaa.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Produto") // facultativo quando o nome da tabela for igual ao nome da classe


public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-incremento
    private Long id;

    @Column(length = 45, nullable = false) // false (NOT NULL), true (NULL)
    private String nome;

    @Column(length = 45)
    private String tipo;

    @Column(length = 225, nullable = false)
    private String descricao;

    @Column(columnDefinition = "DECIMAL(5,2)")
    private double valorCompra;

    @Column(columnDefinition = "DEb                                   CIMAL(5,2)")
    private double Valor_venda;

    @Column(length = 45, nullable = false)
    private int quantidadeEstoque;

    @Column(length = 45, nullable = false)
    private boolean codStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return Valor_venda;
    }

    public void setValorVenda(double valorVenda) {
        this.Valor_venda = valorVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}
