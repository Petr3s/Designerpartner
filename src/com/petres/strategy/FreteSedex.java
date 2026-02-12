package com.petres.strategy;

import com.petres.domain.Pedido;

public class FreteSedex implements FreteStrategy {

    @Override
    public double calcular(Pedido pedido) {
        return pedido.getValorTotal() * 0.15;
    }
}
