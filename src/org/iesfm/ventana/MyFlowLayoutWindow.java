package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket;

public class MyFlowLayoutWindow {

    public static void main(String[] args) {

        JFrame f = new JFrame("Ejercicio");
        f.setBounds(700, 200, 550, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();


        mainPanel.setLayout(new FlowLayout());//Asi tambien se puede crear el Layout


        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Long-Named Button 4");
        JButton button5 = new JButton("5");

        ButtonGroup orientation = new ButtonGroup();
        JRadioButton button6 = new JRadioButton("Left to Right");
        orientation.add(button6);
        JRadioButton button7 = new JRadioButton("Right to Left");
        orientation.add(button7);
        JButton buttonApply = new JButton("Apply Orientation");

        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(button3);
        mainPanel.add(button4);
        mainPanel.add(button5);
        mainPanel.add(button6);
        mainPanel.add(button7);
        mainPanel.add(buttonApply);

        buttonApply.addActionListener(
                e -> {
            FlowLayout flowLayout = (FlowLayout) mainPanel.getLayout();
            if (button6.isSelected()){
                flowLayout.setAlignment(FlowLayout.LEFT);
            } else{
                flowLayout.setAlignment(FlowLayout.RIGHT);
            }

            f.repaint();
            f.revalidate();
        });

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}
