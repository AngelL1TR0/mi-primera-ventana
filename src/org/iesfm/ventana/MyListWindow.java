package org.iesfm.ventana;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.util.List;

public class MyListWindow {

    public static void main(String[] args) {

        JFrame f = new JFrame("FindReplace");
        f.setBounds(
                10, 10, 500, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10,10));

        JPanel northPanel = new JPanel();

        JLabel textoNorte = new JLabel("JList");

        northPanel.add(textoNorte, BorderLayout.CENTER);

        mainPanel.add(northPanel, BorderLayout.NORTH);

        JPanel southPanel = new JPanel();
        JLabel textoSouth = new JLabel("Se agregó un nuevo elemento");

        southPanel.add(textoSouth, BorderLayout.CENTER);

        mainPanel.add(southPanel, BorderLayout.SOUTH);

        JPanel centePanel = new JPanel(new java.awt.GridBagLayout());

        centePanel.add(new JTextField(),
                new GridBagConstraints(
                        0,
                        0,
                        2,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        centePanel.add(new JButton("Agregar"),
                new GridBagConstraints(
                        2,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        JList<String> people = new JList<>();
        DefaultListModel<String> peopleModel = new DefaultListModel<>();
        people.setModel(peopleModel);

        peopleModel.addElement("Paco Locuras");

        centePanel.add(people,
                new GridBagConstraints(
                        0,
                        1,
                        3,
                        2,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        centePanel.add(new JButton("Eliminar"),
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0));
        centePanel.add(new JButton("Borrar Lista"),
                new GridBagConstraints(
                        2,
                        2,
                        2,
                        1,
                        1,
                        1,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0));

        mainPanel.add(centePanel, BorderLayout.CENTER);

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}
