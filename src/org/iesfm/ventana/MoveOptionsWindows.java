package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MoveOptionsWindows extends JFrame {

    private JPanel mainPanel;
    private JTextArea textArea;
    private JButton buttonAddAll;
    private JButton buttonRemoveAll;
    private JButton buttonPasarDerecha;
    private JButton buttonPasarIzquierda;
    private List<String> listaIzq;
    private List<String> listaDer;


    public MoveOptionsWindows(){
        setBounds(
                10,10,500,300
        );
        setTitle("Calculadora");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(createMainPanel());
        repaint();
        revalidate();
    }

    private JPanel createMainPanel() {
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        return mainPanel;
    }


    public static void main(String[] args) {

    }
}
