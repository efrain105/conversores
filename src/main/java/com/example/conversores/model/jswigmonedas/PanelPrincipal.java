package com.example.conversores.model.jswigmonedas;
import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends  JPanel{

    private JLabel resultado;

    public PanelPrincipal() {
        setLayout(new GridLayout(5, 3));
        JLabel titulo = new JLabel("Selecciona las divisas");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(titulo);

    }

}
