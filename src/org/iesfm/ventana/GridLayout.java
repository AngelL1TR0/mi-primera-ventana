package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridLayout {

    public static void main(String[] args) {

        JFrame f = new JFrame("Calculadora");
        f.setBounds(
                700, 200, 400, 400
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel northPanel = new JPanel();
        JPanel southPanel = new JPanel();
        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout());

        northPanel.setLayout(new BorderLayout(5,5));


        TextField pantalla = new TextField();
        northPanel.add(pantalla);

        southPanel.setLayout(new java.awt.GridLayout(5,4, 5, 5));

        JButton rtc = new JButton("Rtc");
        southPanel.add(rtc, BorderLayout.CENTER);
        rtc.addActionListener(e -> {});
        JButton ce = new JButton("CE");
        southPanel.add(ce, BorderLayout.CENTER);
        JButton cl = new JButton("CL");
        southPanel.add(cl, BorderLayout.CENTER);
        JButton masMenos = new JButton("+/-");
        southPanel.add(masMenos, BorderLayout.CENTER);
        JButton siete = new JButton("7");
        southPanel.add(siete, BorderLayout.CENTER);
        JButton ocho = new JButton("8");
        southPanel.add(ocho, BorderLayout.CENTER);
        JButton nueve = new JButton("9");
        southPanel.add(nueve, BorderLayout.CENTER);
        JButton dividir = new JButton("/");
        southPanel.add(dividir, BorderLayout.CENTER);
        JButton cuatro = new JButton("4");
        southPanel.add(cuatro, BorderLayout.CENTER);
        JButton cinco = new JButton("5");
        southPanel.add(cinco, BorderLayout.CENTER);
        JButton seis = new JButton("6");
        southPanel.add(seis, BorderLayout.CENTER);
        JButton multiplicacion = new JButton("*");
        southPanel.add(multiplicacion, BorderLayout.CENTER);
        JButton uno = new JButton("1");
        southPanel.add(uno, BorderLayout.CENTER);
        JButton dos = new JButton("2");
        southPanel.add(dos, BorderLayout.CENTER);
        JButton tres = new JButton("3");
        southPanel.add(tres, BorderLayout.CENTER);
        JButton menos = new JButton("-");
        southPanel.add(menos, BorderLayout.CENTER);
        JButton cero = new JButton("0");
        southPanel.add(cero, BorderLayout.CENTER);
        JButton punto = new JButton(".");
        southPanel.add(punto, BorderLayout.CENTER);
        JButton igual = new JButton("=");
        southPanel.add(igual, BorderLayout.CENTER);
        JButton suma = new JButton("+");
        southPanel.add(suma, BorderLayout.CENTER);


        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}
