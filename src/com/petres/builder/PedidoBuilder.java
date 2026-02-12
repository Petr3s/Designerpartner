package com.petres.builder;

import com.petres.domain.Pedido;
import com.petres.domain.Produto;

import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {

    private String cliente;
    private String endereco;
    private List<Produto> produtos = new ArrayList<>();

    public PedidoBuilder comCliente(String cliente) {
        this.cliente = cliente;
        return this;
    }

    public PedidoBuilder comEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public PedidoBuilder adicionarProduto(String nome, double preco) {
        this.produtos.add(new Produto(nome, preco));
        return this;
    }

    public Pedido build() {
        return new Pedido(cliente, endereco, produtos);
    }
}
