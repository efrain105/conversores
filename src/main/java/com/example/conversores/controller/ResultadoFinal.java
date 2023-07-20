package com.example.conversores.controller;

import com.example.conversores.model.jswigmonedas.PanelCantDivisas;
import com.example.conversores.model.jswigmonedas.OrigenDestinoMonedaPanel;
import com.example.conversores.model.jswigmonedas.PanelResultado;

import java.text.DecimalFormat;

public class ResultadoFinal {

    private static OrigenDestinoMonedaPanel origen;
    private static OrigenDestinoMonedaPanel destino;
    private static PanelCantDivisas cantDivisas;
    private  PanelResultado resultado;

    public ResultadoFinal(OrigenDestinoMonedaPanel origen, OrigenDestinoMonedaPanel destino, PanelCantDivisas cantDivisas) {
        this.origen = origen;
        this.destino = destino;
        this.cantDivisas = cantDivisas;
        this.resultado = resultado;
    }

    public static String resultadoFinal(){
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        ConvertirMoneda conversor = new ConvertirMoneda(origen.getSelectedMoneda(), destino.getSelectedMoneda());
        double resultadoDouble = conversor.convertirDivisas(Double.parseDouble(cantDivisas.getCantidad()),
                origen.getSelectedMoneda().getTasaCambioDolar(), destino.getSelectedMoneda().getTasaCambioDolar());
        String resultadoFormateado = decimalFormat.format(resultadoDouble);
        String resultadoFinal = (destino.getSelectedMoneda().getSimboloDivisa() + resultadoFormateado + " " + destino.getSelectedMoneda().getCodigoDivisa());
        return resultadoFinal;
    }

}
