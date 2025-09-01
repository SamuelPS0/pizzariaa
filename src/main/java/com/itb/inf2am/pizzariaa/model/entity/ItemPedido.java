package com.itb.inf2am.pizzariaa.model.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "ItemPedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-incremento
    private long id;

    @Column(nullable = false)
    private int quantidadeItem;

    private boolean cod_status;

    @Column(columnDefinition = "DECIMAL(5,2)" , nullable = false)
    private int valorUnitario;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public boolean isCod_status() {
        return cod_status;
    }

    public void setCod_status(boolean cod_status) {
        this.cod_status = cod_status;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
