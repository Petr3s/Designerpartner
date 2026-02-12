package com.petres.domain;

import java.util.List;

public class Pedido {

    private String cliente;
    private String endereco;
    private List<Produto> produtos;

    public Pedido(String cliente, String endereco, List<Produto> produtos) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.produtos = produtos;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return produtos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();
    }
}
