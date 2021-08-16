package br.com.alura.designpattern;

import br.com.alura.designpattern.imposto.CalculadoraDeImpostos;
import br.com.alura.designpattern.imposto.ISS;
import br.com.alura.designpattern.imposto.Imposto;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // design strategy
	    Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }
}
