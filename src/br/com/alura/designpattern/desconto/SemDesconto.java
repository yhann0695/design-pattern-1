package br.com.alura.designpattern.desconto;

import br.com.alura.designpattern.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{

    protected SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
