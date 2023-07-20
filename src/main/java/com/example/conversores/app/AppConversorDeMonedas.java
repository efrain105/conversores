package com.example.conversores.app;

import com.example.conversores.controller.ResultadoFinal;
import com.example.conversores.model.Moneda;
import com.example.conversores.model.Monedas;
import com.example.conversores.model.jswigmonedas.*;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class AppConversorDeMonedas {
    public void run(){
        Monedas monedas = new Monedas();
        List<Moneda> nombresMonedas = monedas.getMonedaObject();

        boolean confirmado = false;
        do {
            // Panel origen
            OrigenDestinoMonedaPanel origenMoneda = new OrigenDestinoMonedaPanel("Moneda de origen: ", nombresMonedas);

            //Panel destino
            OrigenDestinoMonedaPanel destinoMoneda = new OrigenDestinoMonedaPanel("Moneda de destino: ", nombresMonedas);



            // Panel cantidad de divisas
            PanelCantDivisas panelIngresoDivisas = new PanelCantDivisas("Ingrese la cantidad: ");


            //PanelResultado
            PanelResultado resultado = new PanelResultado();

            //Panel principal
            PanelPrincipal panelPrincipal = new PanelPrincipal();
            panelPrincipal.add(origenMoneda);
            panelPrincipal.add(destinoMoneda);
            panelPrincipal.add(panelIngresoDivisas);
            panelPrincipal.add(resultado);
            resultado.setHorizontalAlignment(SwingConstants.CENTER);
            BotonesAccions panelBotones = new BotonesAccions(resultado);
            ResultadoFinal resultadoFinal = new ResultadoFinal(origenMoneda,destinoMoneda,panelIngresoDivisas);
            confirmado = panelBotones.getLogic();


            // Ventana principal
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Conversor de moneda");
            frame.getContentPane().setLayout(new BorderLayout());
            frame.getContentPane().add(panelPrincipal, BorderLayout.CENTER);
            frame.getContentPane().add(panelBotones, BorderLayout.SOUTH);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            panelPrincipal.setAlignmentX(Component.CENTER_ALIGNMENT);
            panelBotones.setAlignmentX(Component.CENTER_ALIGNMENT);


            // Esperar hasta que se cierre la ventana
            while (frame.isVisible()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }




        }while (confirmado);
    }
    }

