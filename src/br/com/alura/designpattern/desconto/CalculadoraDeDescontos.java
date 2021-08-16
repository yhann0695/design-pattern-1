package br.com.alura.designpattern.desconto;

import br.com.alura.designpattern.Orcamento;
import br.com.alura.designpattern.descontointerface.DescontoParaOrcamentoComMaisDeCincoItens;
import br.com.alura.designpattern.descontointerface.DescontoParaOrcamentoComValorMaiorQueQuinhentos;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    // design Chain  of Responsibility
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()));
        return cadeiaDeDescontos.calcular(orcamento);
    }
}
