package com.example.conversores.controller;

import com.example.conversores.model.Moneda;

public class ConvertirMoneda implements ConversorInterface {

    private Moneda MonedaOrigen;
    private Moneda MonedaDestino;

    public ConvertirMoneda(Moneda monedaOrigen, Moneda monedaDestino) {
        MonedaOrigen = monedaOrigen;
        MonedaDestino = monedaDestino;
    }

    public Moneda getMonedaOrigen() {
        return MonedaOrigen;
    }

    public void setMonedaOrigen(Moneda monedaOrigen) {
        MonedaOrigen = monedaOrigen;
    }

    public Moneda getMonedaDestino() {
        return MonedaDestino;
    }

    public void setMonedaDestino(Moneda monedaDestino) {
        MonedaDestino = monedaDestino;
    }

    @Override
    public double convertirDivisas(double cantidad, double a, double b) {
        a = this.getMonedaOrigen().getTasaCambioDolar();
        b = this.getMonedaDestino().getTasaCambioDolar();
        double dolares = cantidad * a;
        return dolares / b;
    }


}
