package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayoutWindow {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 550, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        f.setLayout(new FlowLayout());

        mainPanel.add(new JButton("Hide North Border"), BorderLayout.NORTH);
        mainPanel.add(new JButton("Hide South Border"), BorderLayout.SOUTH);
        mainPanel.add(new JButton("Hide West Border"), BorderLayout.WEST);
        mainPanel.add(new JButton("Hide East Border"), BorderLayout.EAST);
        mainPanel.add(new JButton("Hide Center Border"), BorderLayout.CENTER);

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}
