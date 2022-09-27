package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayoutWindow {

    public static void main(String[] args) {
        JFrame f = new JFrame("MyBorderLayoutWindow");
        f.setBounds(
                10, 10, 550, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout(10,10));

        JButton north = new JButton("Hide North Border");
        mainPanel.add(north, BorderLayout.NORTH);
        JButton south = new JButton("Hide South Border");
        mainPanel.add(south, BorderLayout.SOUTH);
        JButton center = new JButton("Hide Center Border");
        mainPanel.add(center, BorderLayout.CENTER);
        JButton east = new JButton("Hide East Border");
        mainPanel.add(east, BorderLayout.EAST);
        JButton west = new JButton("Hide West Border");
        mainPanel.add(west, BorderLayout.WEST);

        north.addActionListener(
                e -> {
                        north.setVisible(false);
        });
        south.addActionListener(
                e -> {
                    south.setVisible(false);
                });
        east.addActionListener(
                e -> {
                    east.setVisible(false);
                });
        west.addActionListener(
                e -> {
                    west.setVisible(false);
                });
        center.addActionListener(
                e -> {
                    center.setVisible(false);
                });

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}
