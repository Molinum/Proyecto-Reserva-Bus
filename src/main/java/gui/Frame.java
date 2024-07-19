package main.java.gui;

import main.java.Main;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(){
        super();
        this.setTitle("Reserva de Asientos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1356,768);
        this.add(new MainPanel());
        this.setVisible(true);
        this.setLayout(new BorderLayout());
    }
}
