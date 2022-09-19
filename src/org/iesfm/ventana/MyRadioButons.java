package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadioButons {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(700, 200, 450, 450);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        ButtonGroup buttons = new ButtonGroup();

        JRadioButton linuxButton = new JRadioButton("Linux" ,true);
        linuxButton.setActionCommand("Linux");
        JRadioButton windowsButton = new JRadioButton("Windows");
        windowsButton.setActionCommand("Windows");
        JRadioButton macButton = new JRadioButton("Macintosh");
        macButton.setActionCommand("Macintosh");

        buttons.add(linuxButton);
        buttons.add(windowsButton);
        buttons.add(macButton);

        mainPanel.add(linuxButton);
        mainPanel.add(windowsButton);
        mainPanel.add(macButton);

        //Creacion de los iconos


        JLabel image = new JLabel();
        image.setIcon(new ImageIcon("Linux.png"));

        mainPanel.add(image);


        //Creacion boton OK
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String selected = buttons.getSelection().getActionCommand();

                JOptionPane.showMessageDialog(f, "Has seleccionado " + selected);

                //Se tendrian que llamar igual para poder hacer el truquito
                image.setIcon(new ImageIcon(selected + ".jpg"));


                //Ejemplo con ifs, es mejor el ejemplo anterior
               /* if (linuxButton.isSelected()){
                    JOptionPane.showMessageDialog(f,"Has seleccionado Linux");
                }
                else if(windowsButton.isSelected()){
                    JOptionPane.showMessageDialog(f,"Has seleccionado Windows");
                } else if (macButton.isSelected()) {
                    JOptionPane.showMessageDialog(f,"Has seleccionado Mac");
                }

                //La f es la ventana que se queda bloqueada hasta que pulsamos otra vez
                JOptionPane.showMessageDialog(f,"Has pulsado el boton");
                 */
            }
        });
        mainPanel.add(okButton);

        f.setContentPane(mainPanel);

        //Estos dos comandos siempre al final, si no crea conficto
        f.repaint();
        f.revalidate();

    }
}
