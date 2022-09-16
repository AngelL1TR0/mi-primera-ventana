package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

import static java.awt.Font.SANS_SERIF;

public class Main {
    public static void main(String[] args) {
        JFrame f  = new JFrame();

        f.setBounds(900, 400, 350, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //este es el panel principal
        JPanel mainpanel = new JPanel();
        //Color
        mainpanel.setBackground(Color.magenta);
        //este es un componente tipo etiqueta
        JLabel label = new JLabel("Hola mundo");
        //color letra
        label.setForeground(Color.BLUE);
        //fuente
        label.setFont(Font.getFont(SANS_SERIF));
        //añadimos la etiqueta al panel
        mainpanel.add(label);
        //hacemos que dentro del panel aparezca la etiqueta
        f.setContentPane(mainpanel);
    }
}
