package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Sub {
    public static void main(String[] args) {

        JFrame j = new JFrame();
        j.setBounds(900, 400, 350, 100);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel m = new JPanel();

        j.setContentPane(m);

        JLabel l = new JLabel("Usuario");
        l.setForeground(Color.BLACK);
        m.add(l);

        JTextField t = new JTextField(15);
        m.add(t);

        JButton b = new JButton("Aceptar");
        m.add(b);

        j.repaint();
        j.revalidate();

    }
}
