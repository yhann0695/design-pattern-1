package br.com.alura.designpattern.pedido.acao;

import br.com.alura.designpattern.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{

    public void executar(Pedido pedido) {
        System.out.println("Salvando dados no banco de dados!");
    }

    @Override
    public void executarAcao(Pedido pedido) {
        executar(pedido);
    }
}
