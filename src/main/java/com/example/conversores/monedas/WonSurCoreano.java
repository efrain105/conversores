package com.example.conversores.monedas;

import com.example.conversores.model.Moneda;

public class WonSurCoreano extends Moneda {
    public WonSurCoreano(){
        this.setCodigoDivisa("KRW");
        this.setNombreDivisa("Won surcoreano");
        this.setSimboloDivisa("₩");
        this.setPaisOrigen("Corea del Sur");
        this.setTasaCambioDolar(0.00079);
    }
}
