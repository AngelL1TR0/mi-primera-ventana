package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo {

    public static void main(String[] args) {

        JFrame f = new JFrame("GridBagLayoutDemo");
        f.setBounds(
                10, 10, 500, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new java.awt.GridBagLayout());

        mainPanel.add(new JButton("One"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JButton("Two"),
                new GridBagConstraints(
                        1,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JButton("Three"),
                new GridBagConstraints(
                        2,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JButton("Four"),
                new GridBagConstraints(
                        0,
                        1,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JButton("Five"),
                new GridBagConstraints(
                        2,
                        1,
                        1,
                        2,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JButton("Six"),
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JButton("Seven"),
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();

    }
}
