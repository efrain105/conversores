package com.example.conversores.monedas;

import com.example.conversores.model.Moneda;

public class YenJapones extends Moneda {
    public YenJapones() {
        this.setCodigoDivisa("JPY");
        this.setNombreDivisa("Yen");
        this.setSimboloDivisa("¥");
        this.setPaisOrigen("Japón");
        this.setTasaCambioDolar(0.0072);
    }
}
