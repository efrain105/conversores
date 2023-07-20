package com.example.conversores.model.jswigmonedas;

import com.example.conversores.controller.JSwingUtilities;
import com.example.conversores.model.Moneda;

import javax.swing.*;
import java.util.List;

public class OrigenDestinoMonedaPanel extends JPanel{
    private final JComboBox<Moneda> comboBox;

    public OrigenDestinoMonedaPanel(String labelText, List<Moneda> monedas) {
        JLabel label = new JLabel(labelText);
        comboBox = new JComboBox<>(monedas.toArray(new Moneda[0]));
        comboBox.setRenderer(new JSwingUtilities.MonedaListCellRenderer());
        add(label);
        add(comboBox);
    }

    public Moneda getSelectedMoneda() {
        return (Moneda) comboBox.getSelectedItem();
    }
}
