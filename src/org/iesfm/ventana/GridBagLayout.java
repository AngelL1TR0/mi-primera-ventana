package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagLayout {

    public static void main(String[] args) {

        JFrame f = new JFrame("GridBagLayoutDemo");
        f.setBounds(
                10, 10, 500, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel( new java.awt.GridBagLayout());

        mainPanel.add(new JButton("Button 1"),
                new GridBagConstraints(
                0,
                0,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0));
        mainPanel.add(new JButton("Button 2"),
                new GridBagConstraints(
                1,
                0,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0));
        mainPanel.add(new JButton("Button 3"),
                new GridBagConstraints(
                3,
                0,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0));
        mainPanel.add(new JButton("long-Named Button 4"),
                new GridBagConstraints(
                0,
                1,
                4,
                1,
                1.0,
                4.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0,0,0,0),
                0,0));
        mainPanel.add(new JButton("5"),
                new GridBagConstraints(
                1,
                2,
                3,
                1,
                1.0,
                1.0,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0,0,0,0),
                0,0));


        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();

    }
}
