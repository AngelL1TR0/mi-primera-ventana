package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class MiTitledBorderWindow {

    public static void main(String[] args) {

        JFrame f = new JFrame("Ejercicio");
        f.setBounds(700, 200, 300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        JPanel searchPanel = new JPanel();
        searchPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.CYAN,1,true),"Search"));

        mainPanel.add(searchPanel);

        ButtonGroup grupoBotones = new ButtonGroup();
        JRadioButton byName = new JRadioButton("By Name");
        grupoBotones.add(byName);
        JRadioButton byId = new JRadioButton("By Id");
        grupoBotones.add(byId);

        searchPanel.add(byName);
        searchPanel.add(byId);

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();


    }
}
