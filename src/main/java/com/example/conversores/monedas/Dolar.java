package com.example.conversores.monedas;

import com.example.conversores.model.Moneda;

public class Dolar extends Moneda {

    public Dolar() {
        this.setCodigoDivisa("USD");
        this.setNombreDivisa("Dólar estadounidense");
        this.setSimboloDivisa("$");
        this.setPaisOrigen("Estados Unidos");
        this.setTasaCambioDolar(1.0);
    }

}
