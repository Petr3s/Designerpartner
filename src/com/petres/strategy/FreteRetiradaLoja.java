package com.petres.strategy;

import com.petres.domain.Pedido;

public class FreteRetiradaLoja implements FreteStrategy {

    @Override
    public double calcular(Pedido pedido) {
        return 0.0;
    }
}
