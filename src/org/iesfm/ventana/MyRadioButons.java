package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class MyRadioButons {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(900, 500, 500, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.CYAN);

        JRadioButton button = new JRadioButton("Aceptar");
        button.setBounds(10, 10, 100, 100);
        button.setBackground(Color.MAGENTA);

        Button button2 = new Button("Rechazar");
        button2.setBounds(20, 10, 100, 100);
        button2.setBackground(Color.MAGENTA);

        mainPanel.add(button);
        mainPanel.add(button2);
        f.add(mainPanel);


    }
}
