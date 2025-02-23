package com.manoelcampos.desconto;

import java.time.LocalDate;

public class Venda {
    private long id;
    private Cliente cliente;
    private LocalDate data;
    private double valorTotal;
    private DescontoStrategy descontoStrategy;

    public Venda() {}

    public Venda(Cliente cliente, LocalDate data, double valorTotal) {
        this.cliente = cliente;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularDesconto() {
        if (descontoStrategy != null) {
            return descontoStrategy.aplicarDesconto(valorTotal, cliente, data);
        }
        return 0;
    }

    public double getValorTotal() {
        return valorTotal - calcularDesconto();
    }
}