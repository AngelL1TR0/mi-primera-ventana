package org.iesfm.ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox {

    public static void main(String[] args) {

        JFrame f = new JFrame("Ejercicio");
        f.setBounds(700, 200, 300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        JLabel texto = new JLabel("Elige un lenguaje de progamacion");
        mainPanel.add(texto);

        JComboBox <String> combo = new JComboBox<>();
        combo.addItem("Java");
        combo.addItem("C");
        combo.addItem("C++");
        combo.addItem("C#");
        combo.addItem("PHP");

        mainPanel.add(combo);

        JButton botonOk = new JButton("OK");
        botonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lenguajeSeleccionado = combo.getItemAt(combo.getSelectedIndex());
                texto.setText("Lenguaje seleccionado: " + lenguajeSeleccionado);
                /*
                //Esto seria en ventana, pero en esta practica no lo vamos a usar
                JOptionPane.showMessageDialog(f,lenguajeSeleccionado);

                 */
            }
        });
        mainPanel.add(botonOk);

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}
