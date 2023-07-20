package com.example.conversores.model.jswigmonedas;

import javax.swing.*;

public class PanelCantDivisas extends JPanel {
    private final JTextField textField;

    public PanelCantDivisas(String mensaje) {
        JLabel labelCantidad = new JLabel(mensaje);
        textField = new JTextField(10);
        add(labelCantidad);
        add(textField);
    }

    public String getCantidad() {
        return textField.getText();
    }

}
