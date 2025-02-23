package com.manoelcampos.desconto;

import java.time.LocalDate;

public class Principal  {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "João", LocalDate.of(1990, 5, 15));

        LocalDate dataVenda = LocalDate.of(2023, 5, 15);
        Venda venda = new Venda(cliente, dataVenda, 1000);


        venda.setDescontoStrategy(new DescontoPercentual(10));
        System.out.println("Valor com desconto percentual: " + venda.getValorTotal());

        venda.setDescontoStrategy(new DescontoProgressivo());
        System.out.println("Valor com desconto progressivo: " + venda.getValorTotal());

        venda.setDescontoStrategy(new DescontoAniversario());
        System.out.println("Valor com desconto de aniversário: " + venda.getValorTotal());
    }
}