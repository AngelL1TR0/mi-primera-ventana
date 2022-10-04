package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class FindReplace {

    public static void main(String[] args) {

        JFrame f = new JFrame("FindReplace");
        f.setBounds(
                10, 10, 500, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new java.awt.GridBagLayout());

        mainPanel.add(new JLabel("Find What"),
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
        mainPanel.add(new JLabel("Replace With"),
                new GridBagConstraints(
                        0,
                        1,
                        1,
                        1,
                        0.3,
                        0.3,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        1,
                        0,
                        2,
                        1,
                        0.3,
                        0.3,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        mainPanel.add(new JTextField(),
                new GridBagConstraints(
                        1,
                        1,
                        2,
                        1,
                        0.3,
                        0.3,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0));


        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}
