package main.java.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomLayered extends JLayeredPane implements ActionListener {

    public CustomLayered() {
        super();
        this.add(new MainPanel());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
