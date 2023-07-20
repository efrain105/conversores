package com.example.conversores.monedas;

import com.example.conversores.model.Moneda;

public class Euro extends Moneda {
    public Euro() {
        this.setCodigoDivisa("EUR");
        this.setNombreDivisa("Euro");
        this.setSimboloDivisa("€");
        this.setPaisOrigen("Europa");
        this.setTasaCambioDolar(1.097);
    }
}
