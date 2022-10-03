package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class gridBagWindow2 {

    public static void main(String[] args) {

        JFrame f = new JFrame("GridBagLayoutDemo");
        f.setBounds(
                10, 10, 500, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel( new java.awt.GridBagLayout());

        mainPanel.add(new JTextArea("Area Texto"),
                new GridBagConstraints(
                        0,
                        0,
                        2,
                        2,
                        1.0,
                        4.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,0));

        mainPanel.add(new JButton("Boton 1"),
                new GridBagConstraints(
                        2,
                        0,
                        1,
                        1,
                        0.5,
                        2.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,0));


        mainPanel.add(new JButton("Boton 2"),
                new GridBagConstraints(
                        2,
                        1,
                        1,
                        1,
                        0.5,
                        2.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,0));
        mainPanel.add(new JButton("Boton 3"),
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        0.5,
                        0.5,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,0));
        mainPanel.add(new JTextField("Campo Texto"),
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        2,
                        0.5,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,0));
        mainPanel.add(new JButton("Boton 4"),
                new GridBagConstraints(
                        2,
                        2,
                        1,
                        1,
                        0.5,
                        0.5,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,0));

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}
