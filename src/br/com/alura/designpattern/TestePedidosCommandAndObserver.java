package br.com.alura.designpattern;

import br.com.alura.designpattern.pedido.GeraPedido;
import br.com.alura.designpattern.pedido.GeraPedidoHandler;
import br.com.alura.designpattern.pedido.acao.EnviarEmailPedido;
import br.com.alura.designpattern.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedidosCommandAndObserver {

    public static void main(String[] args) {
        String cliente = "Yhann";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = 2;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido()));
        handler.execute(gerador);
    }
}
