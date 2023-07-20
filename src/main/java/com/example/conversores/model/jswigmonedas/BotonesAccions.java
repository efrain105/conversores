package com.example.conversores.model.jswigmonedas;
import com.example.conversores.controller.ResultadoFinal;

import javax.swing.*;


public class BotonesAccions extends JPanel{
    private boolean confirmado;


    public BotonesAccions(PanelResultado resultado) {

        JButton botonOK = new JButton("OK");
        JButton botonCancelar = new JButton("Cerrar");


        botonOK.addActionListener(e -> {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(botonOK);
            try {
                confirmado = true;
                /*// Realizar el cálculo y mostrar el resultado en el JLabel
                ConvertirMoneda conversor = new ConvertirMoneda(origen.getSelectedMoneda(), destino.getSelectedMoneda());
                double resultadoFinal = conversor.convertirDivisas(Double.parseDouble(cantDivisas.getCantidad()));
                String resultadoFormateado = decimalFormat.format(resultadoFinal);*/
                resultado.setText("Resultado: " + ResultadoFinal.resultadoFinal() );
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Ingresa un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }

        });

        botonCancelar.addActionListener(e -> {
            confirmado = false;
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(botonCancelar);
            frame.dispose(); // Cerrar la ventana
        });

        // Panel de botones

        add(botonOK);
        add(botonCancelar);


    }

    public boolean getLogic(){
        return confirmado;
    }

}
