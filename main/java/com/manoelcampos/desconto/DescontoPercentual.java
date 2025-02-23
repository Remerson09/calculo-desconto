package com.manoelcampos.desconto;

import java.time.LocalDate;

public class DescontoPercentual implements DescontoStrategy {
    private double percentual;

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double aplicarDesconto(double valorTotal, Cliente cliente, LocalDate data) {
        return valorTotal * (percentual / 100);
    }
}