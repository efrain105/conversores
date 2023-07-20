package com.example.conversores.monedas;

import com.example.conversores.model.Moneda;

public class LibrasEsterlinas extends Moneda {
    public LibrasEsterlinas() {
        this.setCodigoDivisa("GBP");
        this.setNombreDivisa("Libra Esterlina");
        this.setSimboloDivisa("£");
        this.setPaisOrigen("Reino Unido");
        this.setTasaCambioDolar(1.29);
    }
}
