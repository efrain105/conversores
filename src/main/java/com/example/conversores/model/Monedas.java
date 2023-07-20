package com.example.conversores.model;

import com.example.conversores.monedas.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Monedas {
    private final List<Moneda> monedas;

    public Monedas() {
        this.monedas = new ArrayList<>();
        addMoneda(new PesoMexicano());
        addMoneda(new Dolar());
        addMoneda(new Euro());
        addMoneda(new LibrasEsterlinas());
        addMoneda(new YenJapones());
        addMoneda(new WonSurCoreano());
    }

    public List<Moneda> getMonedas() {
        return this.monedas;
    }



    public List<Moneda> getMonedaObject(){
        List<Moneda> monedasDisponibles = new ArrayList<>();
        for (Moneda moneda : monedas) {
            monedasDisponibles.add(moneda);
            monedasDisponibles.sort(Comparator.comparing(Moneda::getCodigoDivisa));
        }
        return monedasDisponibles;
    }

    public void addMoneda(Moneda moneda) {
        this.monedas.add(moneda);
    }


}
