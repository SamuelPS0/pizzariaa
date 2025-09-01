package com.itb.inf2am.pizzariaa.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "DECIMAL (5,2)", nullable = false)
    private int valorPedido;
    @Column(nullable = false)
    private LocalDateTime dataHoraPedido;
    @Column(nullable = true)
    private LocalDateTime dataHoraEntrega;
    @Column(length = 20, nullable = false)
    private boolean status;
    private long codStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(int valorPedido) {
        this.valorPedido = valorPedido;
    }

    public LocalDateTime getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(LocalDateTime dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public LocalDateTime getDataHoraEntrega() {
        return dataHoraEntrega;
    }

    public void setDataHoraEntrega(LocalDateTime dataHoraEntrega) {
        this.dataHoraEntrega = dataHoraEntrega;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getCodStatus() {
        return codStatus;
    }

    public void setCodStatus(long codStatus) {
        this.codStatus = codStatus;
    }

}
