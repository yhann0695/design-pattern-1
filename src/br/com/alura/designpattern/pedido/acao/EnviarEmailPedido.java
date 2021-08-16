package br.com.alura.designpattern.pedido.acao;

import br.com.alura.designpattern.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executar(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido!");
    }

    @Override
    public void executarAcao(Pedido pedido) {
        executar(pedido);
    }
}
