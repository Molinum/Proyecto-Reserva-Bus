package main.java.gui;

import javax.swing.*;

public class Frame extends JFrame {

    public Frame(){
        super();
        this.setTitle("Reserva de Asientos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1356,768);
        this.add(new CustomLayered());
        this.setVisible(true);
        this.setLayout(null);
    }
}
