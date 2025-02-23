package com.manoelcampos.desconto;

import java.time.LocalDate;

public interface DescontoStrategy {
    double aplicarDesconto(double valorTotal, Cliente cliente, LocalDate data);
}