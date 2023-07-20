package com.example.conversores.model;
import java.util.Objects;

public class Moneda {
    private String codigoDivisa;
    private String nombreDivisa;
    private String simboloDivisa;
    private String paisOrigen;
    private double tasaCambioDolar;

    public Moneda() {

    }

    public Moneda(String codigoDivisa, String nombreDivisa, String simboloDivisa, String paisOrigen, double tasaCambioDolar) {
        this.codigoDivisa = codigoDivisa;
        this.nombreDivisa = nombreDivisa;
        this.simboloDivisa = simboloDivisa;
        this.paisOrigen = paisOrigen;
        this.tasaCambioDolar = tasaCambioDolar;
    }

    public String getCodigoDivisa() {
        return codigoDivisa;
    }

    public void setCodigoDivisa(String codigoDivisa) {
        this.codigoDivisa = codigoDivisa;
    }

    public String getNombreDivisa() {
        return nombreDivisa;
    }

    public void setNombreDivisa(String nombreDivisa) {
        this.nombreDivisa = nombreDivisa;
    }

    public String getSimboloDivisa() {
        return simboloDivisa;
    }

    public void setSimboloDivisa(String simboloDivisa) {
        this.simboloDivisa = simboloDivisa;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getTasaCambioDolar() {
        return tasaCambioDolar;
    }

    public void setTasaCambioDolar(double tasaCambioDolar) {
        this.tasaCambioDolar = tasaCambioDolar;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moneda moneda = (Moneda) o;
        return Double.compare(moneda.tasaCambioDolar, tasaCambioDolar) == 0 && Objects.equals(codigoDivisa, moneda.codigoDivisa) && Objects.equals(nombreDivisa, moneda.nombreDivisa) && Objects.equals(simboloDivisa, moneda.simboloDivisa) && Objects.equals(paisOrigen, moneda.paisOrigen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDivisa, nombreDivisa, simboloDivisa, paisOrigen, tasaCambioDolar);
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "codigoDivisa='" + codigoDivisa + '\'' +
                ", nombreDivisa='" + nombreDivisa + '\'' +
                ", simboloDivisa='" + simboloDivisa + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", tasaCambioDolar=" + tasaCambioDolar +
                '}';
    }
}
