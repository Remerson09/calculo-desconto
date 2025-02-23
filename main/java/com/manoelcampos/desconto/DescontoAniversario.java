package com.manoelcampos.desconto;

import java.time.LocalDate;

public class DescontoAniversario implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double valorTotal, Cliente cliente, LocalDate data) {
        if (data.getMonth() == cliente.getDataNascimento().getMonth() &&
                data.getDayOfMonth() == cliente.getDataNascimento().getDayOfMonth()) {
            return valorTotal * 0.15; // 15% de desconto
        }
        return 0;
    }
}