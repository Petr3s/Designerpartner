package com.petres.app;

import com.petres.builder.PedidoBuilder;
import com.petres.domain.Pedido;
import com.petres.strategy.FreteRetiradaLoja;
import com.petres.strategy.FreteStrategy;
import com.petres.strategy.FreteTransportadora;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new PedidoBuilder()
                .comCliente("Petres")
                .comEndereco("Uberaba - MG")
                .adicionarProduto("Teclado", 200)
                .adicionarProduto("Mouse", 120)
                .build();

        FreteStrategy frete = new FreteRetiradaLoja();

        System.out.println("Frete: R$ " + frete.calcular(pedido));
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: R$ " + pedido.getValorTotal());
    }
}
