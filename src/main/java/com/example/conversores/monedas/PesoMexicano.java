package com.example.conversores.monedas;

import com.example.conversores.model.Moneda;

public class PesoMexicano extends Moneda {
    public PesoMexicano() {
        this.setCodigoDivisa("MXN");
        this.setNombreDivisa("Peso Mexicano");
        this.setSimboloDivisa("$");
        this.setPaisOrigen("Mexico");
        this.setTasaCambioDolar(0.05832);
    }
}
