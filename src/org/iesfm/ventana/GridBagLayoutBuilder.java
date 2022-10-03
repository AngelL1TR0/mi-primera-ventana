package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutBuilder {

    public static void main(String[] args) {

        JFrame f = new JFrame("GridBagLayoutBuilder");
        f.setBounds(
                10, 10, 500, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new java.awt.GridBagLayout());

        mainPanel.add(new JLabel("Full Name"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        0.3,
                        0.3,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));

        mainPanel.add(new JLabel("Street"),
                new GridBagConstraints(
                        1,
                        1,
                        1,
                        1,
                        0.3,
                        0.3,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JLabel("City"),
                new GridBagConstraints(
                        2,
                        1,
                        1,
                        1,
                        0.3,
                        0.3,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JLabel("Age"),
                new GridBagConstraints(
                        3,
                        3,
                        1,
                        1,
                        0.3,
                        0.3,
                        GridBagConstraints.EAST,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JLabel("Zip Code"),
                new GridBagConstraints(
                        4,
                        1,
                        1,
                        1,
                        0.3,
                        0.3,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JLabel("Adress"),
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        0.3,
                        0.3,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JLabel("Phone"),
                new GridBagConstraints(
                        0,
                        3,
                        1,
                        1,
                        0.3,
                        0.3,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JLabel("Description"),
                new GridBagConstraints(
                        0,
                        4,
                        1,
                        1,
                        0.3,
                        0.3,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        1,
                        0,
                        4,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        0.5,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        2,
                        2,
                        1,
                        1,
                        0.5,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        4,
                        2,
                        1,
                        1,
                        0.5,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        4,
                        3,
                        1,
                        1,
                        0.5,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        1,
                        3,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        1,
                        4,
                        4,
                        3,
                        4,
                        4,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JButton("Submit"),
                new GridBagConstraints(
                        2,
                        7,
                        3,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0));

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}
