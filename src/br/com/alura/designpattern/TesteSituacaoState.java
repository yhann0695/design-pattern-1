package br.com.alura.designpattern;

import java.math.BigDecimal;

public class TesteSituacaoState {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("500"), 10);
        orcamento.reprovar();
        orcamento.aplicarDescontoExtra();
        System.out.println(orcamento.getValor());
    }
}
