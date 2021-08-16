package br.com.alura.designpattern.imposto;

import br.com.alura.designpattern.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
