package org.iesfm.ventana;

import javax.swing.*;

public class MiTitledBorderWindow {

    public static void main(String[] args) {

        JFrame f = new JFrame("Ejercicio");
        f.setBounds(700, 200, 300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        JLabel texto = new JLabel("Elige un lenguaje de progamacion");
        mainPanel.add(texto);

        
    }
}
