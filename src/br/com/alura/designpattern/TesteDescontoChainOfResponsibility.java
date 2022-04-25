package br.com.alura.designpattern;

import br.com.alura.designpattern.desconto.CalculadoraDeDescontos;

import java.math.BigDecimal;

public class TesteDescontoChainOfResponsibility {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        BigDecimal result1 = calculadora.calcular(primeiro);
        BigDecimal result2 = calculadora.calcular(segundo);
        TesteDescontoChainOfResponsibility.mostrar(result1);
        TesteDescontoChainOfResponsibility.mostrar(result2);

    }

    public static void mostrar(Object result) {
         System.out.println("Resultado: " + result);
    }
}
