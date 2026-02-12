package com.petres.strategy;

import com.petres.domain.Pedido;

public interface FreteStrategy {
    double calcular(Pedido pedido);
}
