package com.manoelcampos.desconto;

import java.time.LocalDate;

public class DescontoProgressivo implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double valorTotal, Cliente cliente, LocalDate data) {
        double desconto = valorTotal / 25;
        double maxDesconto = valorTotal * 0.20; // Limite de 20%
        return Math.min(desconto, maxDesconto);
    }
}