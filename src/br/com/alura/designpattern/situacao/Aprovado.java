package br.com.alura.designpattern.situacao;

import br.com.alura.designpattern.DomainException;
import br.com.alura.designpattern.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{

    @Override
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser aprovado!");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
