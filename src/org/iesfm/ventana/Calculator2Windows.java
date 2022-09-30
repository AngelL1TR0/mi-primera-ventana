package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

public class Calculator2Windows {

    public static void main(String[] args) {

        JFrame f = new JFrame("Calculadora");
        f.setBounds(
                700, 200, 400, 400
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel displayPanel = new JPanel(new BorderLayout());
        JPanel buttonsPanel = new JPanel( new BorderLayout());
        JPanel resetPanel = new JPanel( new BorderLayout());
        JPanel buttonsResetPanel = new JPanel( new BorderLayout());
        JPanel mainPanel = new JPanel( new BorderLayout());

        displayPanel.add(new TextField(40));

        resetPanel.setLayout(new GridLayout(1,1));
        buttonsPanel.setLayout(new java.awt.GridLayout(4,4));

        JButton siete = new JButton("7");
        buttonsPanel.add(siete, BorderLayout.CENTER);
        JButton ocho = new JButton("8");
        buttonsPanel.add(ocho, BorderLayout.CENTER);
        JButton nueve = new JButton("9");
        buttonsPanel.add(nueve, BorderLayout.CENTER);
        JButton delete = new JButton("DEL");
        buttonsPanel.add(delete, BorderLayout.CENTER);
        JButton cuatro = new JButton("4");
        buttonsPanel.add(cuatro, BorderLayout.CENTER);
        JButton cinco = new JButton("5");
        buttonsPanel.add(cinco, BorderLayout.CENTER);
        JButton seis = new JButton("6");
        buttonsPanel.add(seis, BorderLayout.CENTER);
        JButton suma = new JButton("+");
        buttonsPanel.add(suma, BorderLayout.CENTER);
        JButton uno = new JButton("1");
        buttonsPanel.add(uno, BorderLayout.CENTER);
        JButton dos = new JButton("2");
        buttonsPanel.add(dos, BorderLayout.CENTER);
        JButton tres = new JButton("3");
        buttonsPanel.add(tres, BorderLayout.CENTER);
        JButton menos = new JButton("-");
        buttonsPanel.add(menos, BorderLayout.CENTER);
        JButton punto = new JButton(".");
        buttonsPanel.add(punto, BorderLayout.CENTER);
        JButton cero = new JButton("0");
        buttonsPanel.add(cero, BorderLayout.CENTER);
        JButton dividir = new JButton("/");
        buttonsPanel.add(dividir, BorderLayout.CENTER);
        JButton muliplicacion = new JButton("*");
        buttonsPanel.add(muliplicacion, BorderLayout.CENTER);

        JButton reset = new JButton("Reset");
        resetPanel.add(reset);
        JButton igual = new JButton("=");
        resetPanel.add(igual);



        mainPanel.add(displayPanel, BorderLayout.NORTH);
        buttonsResetPanel.add(buttonsPanel, BorderLayout.CENTER);
        buttonsResetPanel.add(resetPanel, BorderLayout.CENTER);
        buttonsResetPanel.add(resetPanel, BorderLayout.SOUTH);
        mainPanel.add(buttonsResetPanel, BorderLayout.CENTER);

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}
