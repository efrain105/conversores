package com.example.conversores.controller;

import com.example.conversores.model.Moneda;

import javax.swing.*;
import java.awt.*;

public class JSwingUtilities {

    public static class MonedaListCellRenderer extends JLabel implements ListCellRenderer<Moneda> {
        @Override
        public Component getListCellRendererComponent(JList<? extends Moneda> list, Moneda value, int index,
                                                      boolean isSelected, boolean cellHasFocus) {
            if (value != null) {
                setText(value.getSimboloDivisa() + " " + value.getCodigoDivisa() + " " + value.getPaisOrigen());
            } else {
                setText("");
            }
            return this;
        }
    }


}
